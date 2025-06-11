/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio30isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio30IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado, contador;
        System.out.println("Digite um valor");
        numero = teclado.nextInt();
        
        contador = 1;
        
        while(contador <= 10){
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador = contador + 1;
        }
        teclado.close();
    }
}
