package org.example.operadores;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Reto3 {
    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);
        double precioBase = 100.0;
        double precioFinal = 0.0;

        System.out.print("Ingrese el tipo de boleto (VIP, ESTUDIANTE, ADULTO_MAYOR, GENERAL): ");
        String tipoEntrada = opt.nextLine().toUpperCase();

        switch (tipoEntrada) {
            case "VIP":
                precioFinal = precioBase + (precioBase * 0.10);
                System.out.println("Boleto VIP (10% de recargo).");
                break;

            case "ESTUDIANTE":
                precioFinal = precioBase - (precioBase * 0.50);
                System.out.println("Boleto ESTUDIANTE (50% de descuento).");
                break;

            case "ADULTO_MAYOR":
                precioFinal = precioBase - (precioBase * 0.40);
                System.out.println("Boleto ADULTO_MAYOR (40% de descuento).");
                break;

            case "GENERAL":
                precioFinal = precioBase;
                System.out.println("Boleto GENERAL (Tarifa base sin modificaciones).");
                break;

            default:
                System.out.println("Tipo de boleto no válido.");
                precioFinal = -1;
                break;
        }
        if (precioFinal != -1) {
            System.out.println("Precio base: $" + precioBase);
            System.out.println("Monto final a pagar: $" + precioFinal);

        }

    }
}