/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio39isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio39IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int linhas, num;
        
        linhas = teclado.nextInt();
        
        for(int cont = 1; cont <= linhas; cont++){
          num = teclado.nextInt();
         if (num == 0) {
                System.out.println("NULL");
            } else {
                if (num % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }                
                if (num > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
        teclado.close();
    }
}
