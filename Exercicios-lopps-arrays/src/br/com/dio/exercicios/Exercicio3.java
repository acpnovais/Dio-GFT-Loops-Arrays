package br.com.dio.exercicios;

//Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior =0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;
            soma += numero;
            count += 1;
        } while(count < 5);

        System.out.println("O maior número digitado é: " + maior);
        System.out.println("A média dos números digitados é: " + soma/5);

    }
}
