/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio41isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio41IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        
       while (true) {
            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x == 0 || y == 0) {
                break; 
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }
        teclado.close();
    }
}
