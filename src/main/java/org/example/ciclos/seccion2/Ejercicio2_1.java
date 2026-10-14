package org.example.ciclos.seccion2;
import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        int pin = 0;
        do {
            System.out.println("Ingrese pin de seguridad");
            pin = Integer.parseInt(consola.nextLine());
            if (pin < 1000 || pin > 9999){
                System.out.println("Error: La clave debe tener exactamente 4 dígitos positivos");
            }
        } while (pin < 1000 || pin > 9999);
    }
}