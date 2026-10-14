package org.example.ciclos.seccion1;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        boolean procesado = true;
        Scanner consola = new Scanner (System.in);
        double transaccion = 0.0;
        double acumulador = 0;
        while (procesado == true) {
            System.out.println("Ingrese monto de la transaccion");
            transaccion = Double.parseDouble(consola.nextLine());
            if (transaccion < 0){
                procesado = false;
                System.out.println("fallo monto no valido");
                break;
            } else if ( acumulador >= 1000000 ) {
                procesado = false;
                System.out.println("fallo exceso de limite");
                break;
            }
            acumulador += transaccion;
        }
        System.out.println("total acumulado: " + acumulador);
    }
}