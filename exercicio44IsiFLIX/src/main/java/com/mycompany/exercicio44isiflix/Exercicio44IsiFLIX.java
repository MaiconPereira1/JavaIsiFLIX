/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio44isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio44IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n, valor2, valor3 ;
        n = teclado.nextInt();
        
        
        for (int cont = 1;cont <= n;cont ++){
            valor2 = cont * cont;
            valor3 = (int) Math.pow(cont, 3);
            
            System.out.println(cont + " " + valor2 + " " + valor3 + "\n"+
                               cont + " " + (valor2 + 1) + " " + (valor3 + 1));
            
        }
        
        teclado.close();
    }
}
