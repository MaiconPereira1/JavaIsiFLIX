/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio45isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio45IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
        int idade, soma = 0, contador = 0;
        double media;

        do {
            idade = teclado.nextInt();

            if (idade >= 0) {
                soma += idade;
                contador++;
            }

        } while (idade >= 0);

        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println(media);
        } 

        teclado.close();
    }
}