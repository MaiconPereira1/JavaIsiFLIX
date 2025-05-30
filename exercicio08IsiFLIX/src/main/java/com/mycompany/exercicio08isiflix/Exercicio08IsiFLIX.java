/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio08isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio08IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double A , B, C, MED;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        
        MED = (A * 2 + B * 3 + C * 5) / 10.0;
        
        System.out.printf("MEDIA = %.1f", MED);
        
        teclado.close();
    }
}
