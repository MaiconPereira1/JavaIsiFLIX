/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio19isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio19IsiFLIX {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      

        int tempo, velocidade, distancia;
        double consumo;

        tempo = teclado.nextInt();       
        velocidade = teclado.nextInt(); 

        distancia = tempo * velocidade; 
        consumo = distancia / 12.0;     
        
        System.out.printf("%.3f\n", consumo);
        
        teclado.close();
    }
}
