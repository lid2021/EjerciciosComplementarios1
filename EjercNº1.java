package com.informatorio;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){

        Scanner introducDatos = new Scanner(System.in);
        System.out.println("Hola, por favor introduce tu nombre: ");
        String nombre = introducDatos.nextLine();
        System.out.println("¡Hola " + nombre+ " !");

    }

}
