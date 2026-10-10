package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Reto1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Scanner opt = new Scanner(System.in);
            System.out.printf("ingrese numero: ");
            int edadUsuario = Integer.parseInt(opt.nextLine());
            if (edadUsuario < 12 ) {
                System.out.println("Infante, requiere tutor de cuenta");
            } else if (edadUsuario >= 12 && edadUsuario <= 17) {
                System.out.println("adolescente, acceso restringido a foros comunitarios");
            } else if (edadUsuario >= 18 && edadUsuario <= 64 ) {
                System.out.println("Adulto,acceso a funcionalidades estándar ");
            } else if (edadUsuario >=65 ) {
                System.out.println("Adulto Mayor, acceso con interfaz adaptada ");
            } else {
                System.out.println("invalido");
            }
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}