/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio22isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio22IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, ano, mes, dia;
        
        valor = teclado.nextInt();
        
        ano = valor / 365;
        valor = valor % 365;
        mes = valor / 30;
        valor = valor % 30;
        dia = valor;
        
        System.out.println(ano   + " ano(s)");
        System.out.println(mes   + " mes(s)");
        System.out.println(dia   + " dia(s)");        
        teclado.close();
    }
}
