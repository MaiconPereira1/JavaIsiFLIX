/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio15isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio15IsiFLIX {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         int a, b, c;
        
         a = teclado.nextInt();
         b = teclado.nextInt();
         c = teclado.nextInt();

        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println(maior + " eh o maior");

        teclado.close();
    }
}
