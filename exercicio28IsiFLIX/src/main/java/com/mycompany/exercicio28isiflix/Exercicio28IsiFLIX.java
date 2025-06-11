/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio28isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio28IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double valor;
        
        valor = teclado.nextDouble();
        
        if(valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(valor > 25 && valor <= 50){
            System.out.println("intervalo  (25,50]");
        }else if(valor > 50 && valor <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(valor > 75 && valor <= 100){
            System.out.println(" Intervalo (75,100])");
        }else{
            System.out.printf("Fora de Intervalo");
        }
        
        
        teclado.close();
    }
}
