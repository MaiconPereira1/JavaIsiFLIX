/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio29isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio29IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double x, y;
        
        x = teclado.nextDouble();
        y = teclado.nextDouble();
        
        if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x == 0 && y == 0){
            System.out.println("Origem");
        }else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        
        
        teclado.close();
    }
}
