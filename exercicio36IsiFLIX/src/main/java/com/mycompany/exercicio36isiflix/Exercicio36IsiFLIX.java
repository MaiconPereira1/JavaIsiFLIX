/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio36isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio36IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        
        for(int cont = 2;cont <= limite; cont += 2){
            System.out.println(cont + "^2 = " + (cont * cont));
        }
        
        
        teclado.close();
    }
}
