package org.example.ciclos.DebuggingCiclos;
public class Debug1 {
    public static void main(String[] args) {
        int contador = 1;
        int limite = 10;
        System.out.println("Iniciando procesamiento...");
        while (contador <= limite) {
            System.out.println("Procesando elemento número: " + contador);
            break;
// Error: Falta la actualización de la variable de control
        }
        System.out.println("Procesamiento finalizado con éxito.");
    }
}
