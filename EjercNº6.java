package com.informatorio;

import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
           
        int resultado = 1;

        Scanner potencia = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        int base = potencia.nextInt();
        System.out.println("Introduzca el exponente: ");
        int exponente = potencia.nextInt();
        potencia.close();
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + exponente + " = " + resultado);
    }

}
