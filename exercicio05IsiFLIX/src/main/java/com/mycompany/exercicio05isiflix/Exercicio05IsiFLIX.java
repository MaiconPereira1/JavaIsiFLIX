/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio05isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio05IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
        
        teclado.close();
    }
}
