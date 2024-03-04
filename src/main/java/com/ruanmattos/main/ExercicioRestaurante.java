/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ruanmattos.main;

import java.util.Scanner;

/**
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioRestaurante {

    /**
     * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da
     * conta a pagar.
     *
     * 1 | Cachorro Quente | R$4.00 2 | X-Salada | R$4.50 3 | X-Bacon | R$5.00 4 | Torrada simples | R$2.00 5 | Refrigerante | R$3.00
     *
     * Dica: if (codigo == 1) { total = quantidade * 4.0; }
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao programa");
        System.out.println("1\t|\tCachorro Quente\t|\t R$ 4.00");
        System.out.println("2\t|\tX-Salada\t|\t R$ 4.50");
        System.out.println("3\t|\tX-Bacon\t\t|\t R$ 5.00");
        System.out.println("4\t|\tTorrada Simples\t|\t R$ 2.00");
        System.out.println("5\t|\tRefrigerante\t|\t R$ 3.00");
        System.out.print("Digite a opção desejada:");
        Scanner s = new Scanner(System.in);
        int opcao = s.nextInt();
        int qtd;
        s.nextLine();
        if (opcao == 1) {
            System.out.print("Digite quantos cachorros quentes deseja comprar:");
            qtd = s.nextInt();
            s.nextLine();
            System.out.println("O valor total da compra é de: R$ " + qtd * 4);
        } else {
            if (opcao == 2) {
                System.out.print("Digite quantos x salada deseja comprar:");
                qtd = s.nextInt();
                s.nextLine();
                System.out.println("O valor total da compra é de: R$ " + qtd * 4.5);
            } else {
                if (opcao == 3) {
                    System.out.print("Digite quantos x bacon deseja comprar:");
                    qtd = s.nextInt();
                    s.nextLine();
                    System.out.println("O valor total da compra é de: R$ " + qtd * 5);
                } else {
                    if (opcao == 4) {
                        System.out.print("Digite quantas torradas simples deseja comprar:");
                        qtd = s.nextInt();
                        s.nextLine();
                        System.out.println("O valor total da compra é de: R$ " + qtd * 2);
                    } else {
                        if (opcao == 5) {
                            System.out.print("Digite quantos refrigerantes deseja comprar:");
                            qtd = s.nextInt();
                            s.nextLine();
                            System.out.println("O valor total da compra é de: R$ " + qtd * 3);
                        }else{
                            System.out.println("Ops. Essa opção não existe, execute novamente o programa");
                        }
                    }
                }
            }
        }
        //System.out.println("");
    }
}
