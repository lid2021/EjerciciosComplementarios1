package com.informatorio;

import java.util.Scanner;

public class Ejercicio9 {
     public static void main(String[] args) {
        Scanner introducTexto = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String texto = introducTexto.nextLine();    
        System.out.println("Introduce una letra: ");
        String letra = introducTexto.nextLine(); 
        introducTexto.close();
              
        System.out.println(texto.split(letra, -1).length-1);
    }
}

