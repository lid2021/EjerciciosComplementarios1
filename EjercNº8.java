package com.informatorio;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
       
        Scanner introducDatos = new Scanner(System.in);
        System.out.println("Nombre y Apellido:  ");
        String nombre = introducDatos.nextLine();         
        System.out.println("Direccion:  ");
        String direccion = introducDatos.nextLine();
        System.out.println("Ciudad:  ");
        String ciudad = introducDatos.nextLine();
        System.out.println("Edad:  ");
        int edad = introducDatos.nextInt();       
        introducDatos.close();

        System.out.println(ciudad+ " - " +direccion+ " - " + edad+ " - "+ nombre+ " - ");

    }

}
    
