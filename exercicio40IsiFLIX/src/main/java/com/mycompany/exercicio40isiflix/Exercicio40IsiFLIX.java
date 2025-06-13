/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio40isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio40IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor;
        
        valor = teclado.nextInt();
        
        for (int cont = 1; cont <= 10000; cont++) {
            if (cont % valor == 2) {
                System.out.println(cont);
            }
        }
        teclado.close();
    }
}
