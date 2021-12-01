package com.informatorio;

import java.util.Scanner;

public class Ejercicio4 {
   public static void main(String[] args) {

       Scanner factorial = new Scanner(System.in);
       int num ;
       System.out.println("Calcular el Factorial");
       System.out.println("Ingrese un número: ");
       num = factorial.nextInt();
       factorial.close();
       System.out.println(num+"! = "+ fact(num));
           
    }

    private static int fact(int num) {
        if(num>1) {
            return (num * fact(num-1));
        }
        else 
            return (1);
           
    }

}
