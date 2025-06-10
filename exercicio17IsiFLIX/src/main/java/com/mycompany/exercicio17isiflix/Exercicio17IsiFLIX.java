/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio17isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio17IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double X1, Y1, 
               X2, Y2,
               CALCULO, RAIZ;
        
        X1 = teclado.nextDouble();
        Y1 = teclado.nextDouble();
        X2 = teclado.nextDouble();
        Y2 = teclado.nextDouble();
        
        CALCULO = Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2);
        RAIZ = Math.sqrt(CALCULO);
        
        System.out.printf("%.4f",RAIZ);
        teclado.close();
    }
}
