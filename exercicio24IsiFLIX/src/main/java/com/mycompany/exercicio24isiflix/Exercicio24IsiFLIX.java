/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio24isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio24IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int A, B, C, D;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        
        if((B > C) && (D > A) && ((C + D) > (A + B)) && (A > 0) && (B > 0) && A %2 == 0){
            System.out.println("Valores Aceitos");
        }else{
            System.out.println("Valores não aceitos");
        }
        
        
        
        teclado.close();
    }
}
