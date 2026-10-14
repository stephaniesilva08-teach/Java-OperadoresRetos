package org.example.ciclos.seccion3;
import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero;
        System.out.println("ingrese numero entero");
        numero = Integer.parseInt(consola.nextLine());
        for (int i = 1; i <= 12; i++){
            System.out.println(numero + "x" + i + "=" + numero*i);
        }
        for (int i= numero; i >= 0; i--){
            System.out.println(i);
        }
    }
}
