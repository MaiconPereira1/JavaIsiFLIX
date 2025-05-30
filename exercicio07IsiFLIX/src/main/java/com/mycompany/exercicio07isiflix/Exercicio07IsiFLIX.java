/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio07isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio07IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B, MED;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble(); 
        
        MED = (A * 3.5 + B * 7.5)/ 11;
        
        System.out.printf("MEDIA = %.5f",  MED);
        
        teclado.close();
    }
}
