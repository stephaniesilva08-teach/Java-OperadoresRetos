package org.example.ciclos.seccion2;
import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                Menu
                1. Consultar Saldo
                2. Realizar Deposito 
                3. Realiar Retiro
                4. Salir del Sistema
                """);
            System.out.println("Ingrese opcion del menu");
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.println("consultando saldis");
                case 2 -> System.out.println("reaalizar deposite");
                case 3 -> System.out.println("sacar plata");
                case 4 -> System.out.println("finish");
                default -> System.out.println("opcion no aceptadis");
            }
        } while(opcion != 4);

    }
}
