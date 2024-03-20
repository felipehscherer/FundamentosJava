package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        Conta conta = new ContaEspecial();
        conta.setNomeDoTitular("Felipe");
        conta.setCpf("111.222.333-44");
        conta.setNumeroDaConta(1);
        conta.setDigitoVerificador(123);

        do {
            System.out.println("Menu de conta bancaria: ");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - DEPOSITAR");
            System.out.println("2 - SACAR");
            System.out.println("3 - EXIBIR DADOS");
            System.out.println("4 - SAQUE ESPECIAL");
            System.out.println("0 - sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe o valor de deposito: ");
                    conta.depositar(sc.nextInt());
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println(conta);
                    break;
                case 2:
                    System.out.println("Informe o valor de saque: ");
                    if (conta.sacar(sc.nextInt())){
                        System.out.println("Valor sacado com sucesso!");
                        System.out.println(conta);
                    } else {
                        System.out.println("Valor invalido!");
                    }
                    break;
                case 3:
                    System.out.println(conta);
                    break;
            }

        }while (opcao != 0);

    }
}