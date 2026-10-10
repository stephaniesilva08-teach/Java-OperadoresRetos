package org.example;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);
        System.out.println("ingrese la edad");
        int edad = Integer.parseInt(opt.nextLine());
        String estadoAcceso = (edad >= 18) ? "Adulto" : "Menor";
        System.out.println("El usuario es: " + estadoAcceso);
    }

}
