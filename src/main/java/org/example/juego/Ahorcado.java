package org.example.juego;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_INTENTOS = 6;
        int opcion = 0;
        double puntajeTotal = 0.0;
        int partidasJugadas = 0;
        int partidasGanadas = 0;

        do {
            System.out.println("\n=== JUEGO DEL AHORCADO ===");
            System.out.println("1. Jugar");
            System.out.println("2. Ver Estadisticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            String entradaOpcion = scanner.nextLine();
            try {
                opcion = Integer.parseInt(entradaOpcion.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un numero valido (1, 2 o 3).");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nombre del jugador: ");
                    String nombreJugador = scanner.nextLine().trim().toUpperCase();

                    while (nombreJugador.length() == 0) {
                        System.out.println("El nombre no puede estar vacio.");
                        System.out.print("Ingrese el nombre del jugador: ");
                        nombreJugador = scanner.nextLine().trim().toUpperCase();
                    }

                    String palabraSecreta = "JAVA";
                    int intentosRestantes = MAX_INTENTOS;
                    boolean juegoGanado = false;

                    StringBuilder mascara = new StringBuilder();
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        mascara.append("_");
                    }

                    StringBuilder historialLetras = new StringBuilder();
                    int letrasAdivinadasContador = 0;
                    int totalIntentosRealizados = 0;

                    while (intentosRestantes > 0 && !juegoGanado) {
                        System.out.println("\n----------------------------------");
                        System.out.println("Palabra secreta: " + mascara.toString().replace("", " ").trim());
                        System.out.println("Intentos restantes: " + intentosRestantes + "/" + MAX_INTENTOS);
                        System.out.println("Letras intentadas: " + (historialLetras.length() == 0 ? "Ninguna" : historialLetras.toString().replace("", " ").trim()));
                        System.out.print("Ingrese una letra: ");

                        String entradaLetra = scanner.nextLine().trim();

                        if (entradaLetra.length() == 0) {
                            System.out.println("Aviso: Debe ingresar un caracter valido.");
                            continue;
                        }

                        char ultimaLetra = Character.toUpperCase(entradaLetra.charAt(0));

                        boolean letraRepetida = false;
                        for (int i = 0; i < historialLetras.length(); i++) {
                            if (historialLetras.charAt(i) == ultimaLetra) {
                                letraRepetida = true;
                                break;
                            }
                        }

                        if (letraRepetida) {
                            System.out.println("Aviso: Ya habias intentado con esa letra. Intenta con otra.");
                            continue;
                        }

                        historialLetras.append(ultimaLetra);
                        totalIntentosRealizados++;

                        boolean acierto = false;
                        for (int i = 0; i < palabraSecreta.length(); i++) {
                            if (Character.toUpperCase(palabraSecreta.charAt(i)) == ultimaLetra) {
                                mascara.setCharAt(i, palabraSecreta.charAt(i));
                                acierto = true;
                                letrasAdivinadasContador++;
                            }
                        }

                        System.out.println(acierto ? "¡Mensaje de Exito: Letra correcta!" : "¡Mensaje de Error: Letra incorrecta!");

                        if (!acierto) {
                            intentosRestantes--;
                        }

                        boolean faltaGuion = false;
                        for (int i = 0; i < mascara.length(); i++) {
                            if (mascara.charAt(i) == '_') {
                                faltaGuion = true;
                                break;
                            }
                        }

                        if (!faltaGuion) {
                            juegoGanado = true;
                            break;
                        }
                    }

                    partidasJugadas++;
                    double porcentajeAciertos = 0.0;
                    if (totalIntentosRealizados > 0) {
                        porcentajeAciertos = ((double) letrasAdivinadasContador / totalIntentosRealizados) * 100.0;
                    }

                    double puntajeFinal = 0.0;
                    String estadoFinal = "";

                    if (juegoGanado) {
                        estadoFinal = "¡VICTORIA!";
                        puntajeFinal = (intentosRestantes * 25.0) + 50.0;
                    } else {
                        estadoFinal = "DERROTA";
                        puntajeFinal = 0.0;
                    }

                    puntajeTotal += puntajeFinal;
                    if (juegoGanado) {
                        partidasGanadas++;
                    }

                    System.out.println("\n== RESUMEN DE LA PARTIDA ==");
                    System.out.printf("Jugador:              %s\n", nombreJugador);
                    System.out.printf("Estado Final:         %s\n", estadoFinal);
                    System.out.printf("Palabra Secreta:      %s\n", palabraSecreta);
                    System.out.printf("Intentos Restantes:   %d/%d\n", intentosRestantes, MAX_INTENTOS);
                    System.out.printf("Porcentaje Aciertos:  %.2f%%\n", porcentajeAciertos);
                    System.out.printf("Puntaje Final:        %.2f pts\n", puntajeFinal);
                    break;

                case 2:
                    System.out.println("\n== ESTADISTICAS GENERALES ==");
                    System.out.printf("Partidas Jugadas:     %d\n", partidasJugadas);
                    System.out.printf("Partidas Ganadas:     %d\n", partidasGanadas);
                    System.out.printf("Puntaje Acumulado:    %.2f pts\n", puntajeTotal);
                    break;

                case 3:
                    System.out.println("\nGracias por jugar. Saliendo de la aplicacion...");
                    break;

                default:
                    System.out.println("Error: Opcion fuera de rango. Seleccione 1, 2 o 3.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}