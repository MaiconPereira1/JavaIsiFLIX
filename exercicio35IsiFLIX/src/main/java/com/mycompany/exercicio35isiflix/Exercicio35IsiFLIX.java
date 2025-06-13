/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio35isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio35IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inicio =teclado.nextInt();
        
        if (inicio % 2 == 0){
            inicio++;
        }
        for(int contador =1; contador <=6; contador++){
        System.out.println(inicio);
        inicio += 2;
        }
        teclado.close();
    }
}
