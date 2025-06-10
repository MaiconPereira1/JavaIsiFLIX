/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio21isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio21IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor, hora, min, seg;
        
        valor = teclado.nextInt();
        
        hora = valor / 3600;
        valor = valor % 3600;
        min = valor / 60;
        valor = valor % 60;
        seg = valor;
        
        System.out.println(hora + ":" + min + ":" + seg);
        
        
        
        teclado.close();
    }
}
