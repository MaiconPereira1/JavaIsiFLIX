/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio18isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio18IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int km, tempo;
        
        km = teclado.nextInt();
        tempo = km * 2;
        
        System.out.println(tempo + " minutos");
        
        teclado.close();
    }
}
