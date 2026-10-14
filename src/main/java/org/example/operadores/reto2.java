package org.example.operadores;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class reto2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Scanner opt = new Scanner(System.in);
            System.out.println("ingrese calificacion final: ");
            float calificacionFinal = Float.parseFloat(opt.nextLine());
            System.out.println("ingrese porcentaje asistencia: ");
            int porcentajeAsistencia = Integer.parseInt(opt.nextLine());
            System.out.println("ingrese true o false a entrego proyecto final : ");
            boolean entregoProyectoFinal = Boolean.parseBoolean(opt.nextLine());
            if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
                System.out.println("APRUEBA");
            } else if (entregoProyectoFinal == true && calificacionFinal >= 60.0) {
                System.out.println("Pendiente de Examen Extraordinario");
            } else {
                System.out.println("REPROBADO");
            }
        }
    }
}
