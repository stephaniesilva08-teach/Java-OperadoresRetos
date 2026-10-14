package org.example.ciclos.DebuggingCiclos;
public class Debug2 {
    public static void main(String[] args) {
        int totalElementos = 5;
        System.out.println("Imprimiendo elementos del 1 al " + totalElementos +
                ":");
// Error: Condición de parada con operador relacional incorrecto (< enlugar de <=)
        for (int i = 1; i < totalElementos; i++) {
            System.out.println("Elemento " + i);
        }
    }
}
