/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio42isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio42IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cod, alcool = 0, gasolina = 0, diesel = 0;
       
         while (true) {
            cod = teclado.nextInt();

            if (cod == 4) {
                break; 
            }

            if (cod >= 1 && cod <= 3) {  
                if (cod == 1) {
                    alcool++;
                } else if (cod == 2) {
                    gasolina++;
                } else { 
                    diesel++;
                }
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        
        teclado.close();
    }
}
