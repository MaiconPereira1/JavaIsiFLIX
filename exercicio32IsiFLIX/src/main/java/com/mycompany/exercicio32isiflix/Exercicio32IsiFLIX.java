/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio32isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio32IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Digite um valor:");
        
        numero = teclado.nextInt();
        
        for(int contador = 1;contador <= 10; contador = contador + 1 ){
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
        
        
        teclado.close();
    }
}
