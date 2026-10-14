package org.example.ciclos.seccion4;
public class Ejercicio4_1 {
    public static void main(String[] args) {
        System.out.println("Ingrese numero: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 11 == 0 ){
                System.out.println("Número encontrado: " + i);
                break;
            }
        }
    }
}
