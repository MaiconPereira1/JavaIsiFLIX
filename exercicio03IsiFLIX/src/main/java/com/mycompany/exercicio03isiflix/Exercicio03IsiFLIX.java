/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio03IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int A, B, X;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        X = A + B;
        
        System.out.println("X = " + X);
        
        teclado.close();
    }
}
