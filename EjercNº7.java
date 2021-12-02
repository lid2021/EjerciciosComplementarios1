package com.informatorio;

import java.util.Scanner;

public class Ejercicio7 {
     public static void main(String[] args){
      
        Scanner aMayusc = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minuscula: ");
        String palabra = aMayusc.nextLine();
        aMayusc.close();
        System.out.println(pasarAMayusc(palabra));
    }
    
    private static String pasarAMayusc(String palabra){
        String result = "";
        char texto = ' ';
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i)>='a'&& palabra.charAt(i) <= 'z'){
                texto = (char)(palabra.charAt(i) - 32);
            }
            else{
                texto = (char)(palabra.charAt(i));
            }
            result += texto;
        }
        return result;
    }
    

}
