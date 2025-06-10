/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio25isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio25IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double A, B, C, DELTA, X1, X2;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        
        DELTA = (B * B) - (4 * A * C);
        
        if(A != 0 && DELTA >= 0){
            X1 = (-B + Math.sqrt(DELTA)) / (2 * A);
            X2 = (-B - Math.sqrt(DELTA)) / (2 * A);
            
            System.out.printf("R1 = %.5f\n", X1);
            System.out.printf("R2 = %.5f", X2);
        }else{
            System.out.println("Imposivel calcular");
        }
        
        
        teclado.close();
        
    }
}
