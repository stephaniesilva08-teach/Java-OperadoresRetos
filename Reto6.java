package org.example;
public class Reto6 {
    public static void main(String[] args) {
        int cantidad = 3;
        String tipoCliente = "VIP";
        String cupon = "PROMO1 año";
        double precioUnitario = 250.00;
        double subtotalBase = cantidad * precioUnitario;
        double porcentajeDescuento = switch (tipoCliente.toUpperCase().trim()) {
            case "VIP" -> 0.20;
            case "REGULAR" -> 0.10;
            case "NUEVO" -> 0.05;
            default -> 0.0;
        };
        double montoDescuentoCliente = subtotalBase * porcentajeDescuento;
        double subtotalConDescuento = subtotalBase - montoDescuentoCliente;
        double descuentoCupon = 0.0;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }
        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double totalFinal = baseImponible + iva;

        System.out.println("=== SIMULADOR DE CAJA E INVENTARIO ===");
        System.out.println("Cantidad de licencias: " + cantidad);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Subtotal Base: $" + subtotalBase);
        System.out.println("Descuento por categoría: -$" + montoDescuentoCliente);
        System.out.println("Subtotal con descuento: $" + subtotalConDescuento);
        System.out.println("Descuento por cupón (" + cupon + "): -$" + descuentoCupon);
        System.out.println("Base Imponible: $" + baseImponible);
        System.out.println("IVA (16%): +$" + iva);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
