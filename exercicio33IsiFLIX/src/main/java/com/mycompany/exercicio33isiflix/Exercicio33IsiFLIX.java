/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio33isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio33IsiFLIX {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int valor, impar = 0, par = 0;
       
       for(int cont = 1;cont <= 5; cont++){
           valor = teclado.nextInt();
           if(valor % 2 != 0){
               impar++;
           }else{
               par++;
           }
       }
       System.out.println(impar + " Valores impares");
       System.out.println(par + " Valores pares");
       
       teclado.close();
       
    }
}
