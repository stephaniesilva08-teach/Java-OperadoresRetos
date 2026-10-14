package org.example.ciclos.seccion3;
import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero;
        int factorial = 0;
        System.out.println("ingrese numero entero positivo");
        numero = Integer.parseInt(consola.nextLine());
        for (int i = numero; i >0; i--) {
            factorial += i*(i-1);
        }
        System.out.println(numero + "!=" + factorial);
        for (int fila = 1; fila <= numero; fila++){
            for(int elemento =1; elemento <= fila; elemento++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
