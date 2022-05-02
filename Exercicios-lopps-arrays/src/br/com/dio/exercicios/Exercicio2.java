package br.com.dio.exercicios;

//Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
// e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public interface Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Valor da nota (entre 0 e 10): ");
        nota = scan.nextInt();

        while (nota > 10 | nota < 0){
            System.out.println("Digite um valor válido: ");
            nota = scan.nextInt();
            }

    }
}
