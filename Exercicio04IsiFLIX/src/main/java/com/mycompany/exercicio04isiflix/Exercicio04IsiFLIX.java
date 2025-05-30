/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio04isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio04IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, area, n = 3.14159;
        
        raio = teclado.nextDouble();
        
        area = (raio * raio) * n;
        
        System.out.printf("A = %.4f", area);
        teclado.close();
    }
}
