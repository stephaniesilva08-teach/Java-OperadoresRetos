package org.example.ciclos.seccion1;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner cconsola = new Scanner (System.in);
        int numeroCentinela = -99;
        int acumulador = 0;
        int contador = 0;
        int numeroIngresado = 0;
        while(numeroCentinela != numeroIngresado){
            System.out.println("Ingrese un " );
            numeroIngresado = Integer.parseInt(cconsola.nextLine());
            if (numeroIngresado != numeroCentinela) {
                acumulador += numeroIngresado;
                contador++;
            }
        }
        System.out.println("acumulador:" + acumulador);
        System.out.println("contador:" + contador);
    }
}