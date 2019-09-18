package com.company;

import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        double soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Total de alunos na turma:");
        int quantos = sc.nextInt();
        for (int i = 1 ; i<=quantos ; i++)
        {
            System.out.println("Informe a nota do aluno "+i+":");
            double nota = sc.nextDouble();
            soma = soma + nota;
        }
        System.out.printf("A média da turma é: %.2f",soma/quantos);
    }
}
