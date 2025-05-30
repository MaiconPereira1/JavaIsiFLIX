/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio11isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio11IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String NAME;
        double SALES, SALARY, COMMISSION, TOTAL;
        
        NAME = teclado.nextLine();
        SALARY = teclado.nextDouble();
        SALES = teclado.nextDouble();
        
        COMMISSION = SALES * 0.15;
        TOTAL = SALARY + COMMISSION;
        
        System.out.printf("TOTAL = R$ %.2f", TOTAL);
        
        teclado.close();
    }
}
