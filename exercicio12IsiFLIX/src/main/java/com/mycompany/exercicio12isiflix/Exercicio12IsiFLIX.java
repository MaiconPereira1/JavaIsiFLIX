/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio12isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio12IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int COD1, COD2, QTD1, QTD2;
        double VLR1, VLR2, CALCULO;
        
        COD1 = teclado.nextInt();
        QTD1 = teclado.nextInt();
        VLR1 = teclado.nextDouble();
        
        COD2 = teclado.nextInt();
        QTD2 = teclado.nextInt();
        VLR2 = teclado.nextDouble();
        
            CALCULO = (QTD1 * VLR1) + ( QTD2 * VLR2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", CALCULO);
        
        teclado.close();
    }
}
