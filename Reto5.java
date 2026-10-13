package org.example;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args){
        Scanner opt = new Scanner(System.in);
        System.out.print("Ingrese un número de día (1 para Lunes, 7 para Domingo): ");
        int dia = Integer.parseInt(opt.nextLine());
        String jornadaTradicional = "";
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                jornadaTradicional = "Jornada Laboral / Día Hábil";
                break;
            case 6:
            case 7:
                jornadaTradicional = "Fin de Semana / Descanso";
                break;
            default:
                jornadaTradicional = "Día inválido";
                break;
        }
        System.out.println("[Tradicional] Resultado: " + jornadaTradicional);

        String jornadaModerna = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Jornada Laboral / Día Hábil";
            case 6, 7 -> "Fin de Semana / Descanso";
            default -> "Día inválido";
        };

        System.out.println("[Moderna] Resultado: " + jornadaModerna);
    }
}
