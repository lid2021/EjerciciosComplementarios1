package com.informatorio;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner numInt = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num1 = numInt.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = numInt.nextInt();
        numInt.close();

        numeroIngresado (num1, num2);
           
    }
    public static void numeroIngresado(int num1, int num2){
        int mult = num1 * num2;
            
        System.out.println(num1 + " x " + num2 + " " +"="+ " " +mult);
        
    }    
}
