package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        HashSet<Livro> estanteDeLivros = new HashSet<>();
        int escolha;

        Livro l0 = new Livro("A volta dos que não foram", "Nei Mato Grosso", 1999, Categoria.SUSPENSE, false);
        Livro l1 = new Livro("A volta dos que não foram EDIÇÃO ESPECIAL", "Nei Mato Grosso", 1901, Categoria.SUSPENSE, true);
        Livro l2 = new Livro("A volta dos que não foram pt.2", "Nei Mato Grosso", 1999, Categoria.SUSPENSE, false);
        Livro l3 = new Livro("A volta dos que não foram pt.3", "Nei Mato Grosso", 1999, Categoria.SUSPENSE, true);
        Livro l4 = new Livro("A volta dos que não foram pt.4", "Nei Mato Grosso", 1999, Categoria.SUSPENSE, false);

        estanteDeLivros.add(l0);
        estanteDeLivros.add(l1);
        estanteDeLivros.add(l2);
        estanteDeLivros.add(l3);
        estanteDeLivros.add(l4);

        op.adicionarLivro(l0);
        op.adicionarLivro(l1);
        op.adicionarLivro(l2);
        op.removerLivro(l0);
        op.removerLivro(l1);
        op.removerLivro(l2);



       /* do {
            System.out.println("Sistema de Gerenciamento de Biblioteca");
            System.out.println("1 - Ver todos os livros;");
            System.out.println("2 - Ver os livros disponiveis.");
            System.out.println("0 - EXIT");

            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    op.catalogoDeLivros(estanteDeLivros);
                    break;
                case 2:
                    op.livrosDisponiveis(estanteDeLivros);
                    break;
            }
        } while (escolha != 0); */



    }
}