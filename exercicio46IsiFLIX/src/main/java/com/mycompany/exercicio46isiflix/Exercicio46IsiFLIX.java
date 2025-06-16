/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio46isiflix;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class Exercicio46IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();  

        for (int i = 0; i < N; i++) {
            int X = teclado.nextInt();
            int soma = 0;

            
            for (int j = 1; j < X; j++) {
                if (X % j == 0) {
                    soma += j;
                }
            }
            if (soma == X) {
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }
        }

        teclado.close();
    }
}
