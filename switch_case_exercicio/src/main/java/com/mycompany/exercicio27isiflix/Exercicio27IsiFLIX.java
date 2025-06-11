/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio27isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio27IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        System.out.println("Digite o Status do seu pedido");
        String status = teclado.nextLine();
        
        switch(status){
            case "n":
            case "N":
            case "Novo":
                System.out.println("Status do pedido 12345: Novo");
                break;
            case "s":
            case "S":
            case "Separa":
                System.out.println("Status do pedido 12345: Em separação");
                break;
            case "f":
            case "F":
            case "Finalizado":
                System.out.println("Status do pedido 12345: Finalizado");
                break;    
        }
        
        
        teclado.close();
    }
}
