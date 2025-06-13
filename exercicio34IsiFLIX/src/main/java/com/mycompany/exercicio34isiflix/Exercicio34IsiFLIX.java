/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio34isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio34IsiFLIX {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int valor, impar = 0, par = 0, pos = 0, neg = 0;
       
       for(int cont = 1; cont <= 5; cont++){
           valor = teclado.nextInt();
           if(valor %2!=0){
               impar++;
           }else{
               par++;
           } 
           if(valor > 0){
               pos++;
           }else if(valor < 0){
               neg++;
           }
       }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
       
       teclado.close();
    }
}
