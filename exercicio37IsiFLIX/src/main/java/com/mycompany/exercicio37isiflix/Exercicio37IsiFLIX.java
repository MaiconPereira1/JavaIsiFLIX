/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio37isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio37IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int senha;
        
        do{
            senha = teclado.nextInt();
            if(senha != 2002){
                System.out.println("Senha Inválida");
            }else{
                System.out.println("Acesso Permitido");
            }
        }while(senha != 2002);
        
        
        teclado.close();
    }
}
