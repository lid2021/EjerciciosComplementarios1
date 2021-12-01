package com.informatorio;

import java.util.Scanner;

  public static void main(String[] args){
        
        Scanner filas = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = filas.nextInt();
        filas.close();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < i+2; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
            
    }
}
