package com.mycompany.exercicio23isiflix;

import java.util.Scanner;

public class Exercicio23IsiFLIX {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double entrada = teclado.nextDouble();
        int valor = (int) Math.round(entrada * 100); // Convertendo para centavos (int)

        int not100, not50, not20, not10, not5, not2;
        int moe1, moe50, moe25, moe10, moe5, moe01;

        not100 = valor / 10000;
        valor = valor % 10000;

        not50 = valor / 5000;
        valor = valor % 5000;

        not20 = valor / 2000;
        valor = valor % 2000;

        not10 = valor / 1000;
        valor = valor % 1000;

        not5 = valor / 500;
        valor = valor % 500;

        not2 = valor / 200;
        valor = valor % 200;

        moe1 = valor / 100;
        valor = valor % 100;

        moe50 = valor / 50;
        valor = valor % 50;

        moe25 = valor / 25;
        valor = valor % 25;

        moe10 = valor / 10;
        valor = valor % 10;

        moe5 = valor / 5;
        valor = valor % 5;

        moe01 = valor;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100,00\n", not100);
        System.out.printf("%d nota(s) de R$ 50,00\n", not50);
        System.out.printf("%d nota(s) de R$ 20,00\n", not20);
        System.out.printf("%d nota(s) de R$ 10,00\n", not10);
        System.out.printf("%d nota(s) de R$ 5,00\n", not5);
        System.out.printf("%d nota(s) de R$ 2,00\n", not2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1,00\n", moe1);
        System.out.printf("%d moeda(s) de R$ 0,50\n", moe50);
        System.out.printf("%d moeda(s) de R$ 0,25\n", moe25);
        System.out.printf("%d moeda(s) de R$ 0,10\n", moe10);
        System.out.printf("%d moeda(s) de R$ 0,05\n", moe5);
        System.out.printf("%d moeda(s) de R$ 0,01\n", moe01);

        teclado.close();
    }
}
