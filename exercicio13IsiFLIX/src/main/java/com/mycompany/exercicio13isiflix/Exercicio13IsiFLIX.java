/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio13isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio13IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
        double r, volume, pi = 3.14159 ;
        
        r = teclado.nextDouble();
        volume = (4 / 3.0) * pi * (r * r * r); //ou para potencia usaria Math.pow(r, 3)
        
        System.out.printf("VOLUME = %.3f", volume);
        
        teclado.close();
    }
}
