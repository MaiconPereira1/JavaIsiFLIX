/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio38isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio38IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int linhas, num =1;
        
        linhas = teclado.nextInt();
        
        for(int cont =1; cont <= linhas; cont++){
            System.out.println(num + " " + (num + 1) + " " + (num + 2) + " PUM");
            num +=4;
        }
        
        
        teclado.close();
    }
}
