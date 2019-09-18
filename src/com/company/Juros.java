package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("R$ #,##0.00");
        System.out.println("Informe o total investido:");
        double grana = sc.nextDouble();
        System.out.println("Informe o total de meses do investimento:");
        int meses = sc.nextInt();
        System.out.println("Informe a taxa de juros ao mês:");
        double taxa = sc.nextDouble();
        System.out.println();
        System.out.printf("R$ %.2f \n", grana);
        System.out.println(meses + " meses");
        System.out.println(taxa + "% ao mês");
        System.out.println();
        System.out.println("Executando cálculos:");
        System.out.println();
        double total = 0;
        for (int i = 1; i <= meses; i++) {
            total = taxa / 100 * grana + grana;
            System.out.println(i + "º mês: " + d.format(total));
            grana = total;
        }
    }
}
