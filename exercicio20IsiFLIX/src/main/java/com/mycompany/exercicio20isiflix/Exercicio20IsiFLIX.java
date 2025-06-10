/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio20isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio20IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, not100, not50, not20, not10, not5, not2, not1;
        
        valor = teclado.nextInt();
        System.out.println(valor);
        
        not100 = valor /100;
        valor = valor % 100;
        
        not50 = valor /50;
        valor = valor % 50;
        
        not20 = valor /20;
        valor = valor % 20;
        
        not10 = valor /10;
        valor = valor % 10;
        
        not5 = valor /5;
        valor = valor % 5;
        
        not2 = valor /2;
        valor = valor % 2;
        not1 = valor;
        
        System.out.println(not100 + " nota(s) de R$ 100,00");
        System.out.println(not50  + " nota(s) de R$ 50,00");
        System.out.println(not20  + " nota(s) de R$ 20,00");
        System.out.println(not10  + " nota(s) de R$ 10,00");
        System.out.println(not5   + " nota(s) de R$ 5,00");
        System.out.println(not2   + " nota(s) de R$ 2,00");
        System.out.println(not1   + " nota(s) de R$ 1,00");
        
        
        
        teclado.close();
    }
}
