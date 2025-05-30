/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio02IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int a; 
        float b;
        double c;
        
        System.out.println("Por favor digite um numero inteiro:");
        a = teclado.nextInt();
        System.out.println("Você digitou o valor " + a);
        System.out.println("Por favor digite um numero float");
        b = teclado.nextFloat();
        System.out.println("Você digitou o valor " + b);
        System.out.println("Por favor digite um numero double");
        c = teclado.nextDouble();
        System.out.println("Você digitou o valor " + c);
        
       
       String nome;
       int codigo;
       double salario;
       
        System.out.println("Digite seu codigo:");
        codigo = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();
        System.out.println("Digite o seu salário:");
        salario = Double.parseDouble(teclado.nextLine());
        System.out.println("Seu codigo, nome e salário: " + codigo + " - " + nome + " - R$:" + salario);
       
        teclado.close();
    }
}
