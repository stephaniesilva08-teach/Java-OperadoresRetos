package org.example;
public class Fragmento3 {
    public static void main(String[] args) {
        int opcionCategoria = 1;
// PUNTO DE INSPECCIÓN: Observe la ejecución secuencial al omitir sentencias de parada
        switch (opcionCategoria) {
            case 1:
                System.out.println("Categoría Selección: Lunes (Jornada Laboral)");
                break;
            case 2:
                System.out.println("Categoría Selección: Martes (Jornada Laboral)");
                break;
            case 3:
                System.out.println("Categoría Selección: Miércoles (Jornada Laboral)");
                break;
            default:
                System.out.println("Día no identificado");
                break;
        }
    }
}
