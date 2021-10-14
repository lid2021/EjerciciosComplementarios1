package com.informatorio;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int factorial = 1;
        int numero;

        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = valor.nextInt();
        for (int i = numero; i > 0; i--) {
            factorial = factorial *i;
        }
        System.out.println("El factorial del numero " + numero + " es: " + factorial);
    }

}