package org.example;
public class Fragmento4 {
    public static void main(String[] args) {
        float tareasCompletadas = 3.0f;
        float tareasTotales = 4.0f;
// PUNTO DE INSPECCIÓN: Verifique por qué (3 / 4) trunca los decimales a 0 antes de multiplicar por 100

// PISTA DE SOLUCIÓN: Utilice un moldeo de tipo '(double)' o cambie un literal a flotante '4.0'
        double porcentajeAvance = (tareasCompletadas / tareasTotales) * 100;
        System.out.println("El porcentaje de avance es: " + porcentajeAvance + "%");
    }
}
