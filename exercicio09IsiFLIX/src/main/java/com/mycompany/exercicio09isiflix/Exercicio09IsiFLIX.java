/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio09isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio09IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENÇA = " + DIFERENCA);
        teclado.close();
    }
}
