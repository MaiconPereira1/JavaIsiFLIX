/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio10IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NUM, HOUR;
        double SALARYHOUR, SALARY;
        
        NUM = teclado.nextInt();
        HOUR = teclado.nextInt();
        SALARYHOUR = teclado.nextDouble();
        
        SALARY = SALARYHOUR * HOUR;
        
        System.out.printf("NUMBER = " + NUM + "\n" + "SALARY = U$ %.2f", SALARY );
        
        teclado.close();
    }
}
