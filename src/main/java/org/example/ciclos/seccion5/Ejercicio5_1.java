package org.example.ciclos.seccion5;

import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        int stockTotalAlmacen = 0;
        final int CAPACIDAD_MAXIMA = 500;
        do {
            System.out.println("""
                Menu
                1. Registrar Lote de Productos
                2. Ver Estado del Almacén
                3. Salir
                """);
            opcion = Integer.parseInt(consola.nextLine());
            if (opcion == 1) {
                System.out.print("Ingrese la cantidad fija de productos que componen el lote: ");
                int n = Integer.parseInt(consola.nextLine());
                for (int i = 1; i <= n; i++) {
                    System.out.println("Registrando " + i + " de " + n + " ");
                    System.out.print("¿Esta descontinuado? (s/n): ");
                    String estado = consola.nextLine();
                    if (estado.equals("s")) {
                        System.out.println("Producto descontinuado");
                        continue;
                    }
                    double precio = 0;
                    while (precio <= 0) {
                        System.out.print("Ingrese el precio del producto: ");
                        precio = Double.parseDouble(consola.nextLine());
                        if (precio <= 0) {
                            System.out.println("Valor inválido");
                        }
                    }
                    int cantidadStock = 0;
                    while (cantidadStock <= 0) {
                        System.out.print("Ingrese la cantidad en stock: ");
                        cantidadStock = Integer.parseInt(consola.nextLine());
                        if (cantidadStock <= 0) {
                            System.out.println("Valor inválido");
                        }
                    }
                    if (stockTotalAlmacen + cantidadStock > CAPACIDAD_MAXIMA) {
                        System.out.println("La capacidad máxima (" + CAPACIDAD_MAXIMA + " unidades) ha sido superada");
                        System.out.println("terminando procesamiento del lote");
                        break;
                    }
                    stockTotalAlmacen += cantidadStock;
                    System.out.println("Producto registrado");
                }
            } else if (opcion == 2) {
                System.out.println("Estado Actual del Almacén");
                System.out.println("Unidades almacenadas: " + stockTotalAlmacen);
                System.out.println("Capacidad maxima: " + CAPACIDAD_MAXIMA);
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema");
            } else {
                System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }
}
