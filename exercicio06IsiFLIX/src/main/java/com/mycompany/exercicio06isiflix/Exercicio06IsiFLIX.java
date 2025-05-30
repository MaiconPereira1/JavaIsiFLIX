/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio06IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int A, B, PROD;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        PROD = A * B;
        
        System.out.println("PROD = " + PROD);
        
        teclado.close();
    }
}
