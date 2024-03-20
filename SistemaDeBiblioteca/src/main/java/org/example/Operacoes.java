package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Operacoes {
    List<Livro> estanteDeLivrok = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        estanteDeLivrok.add(livro);
        System.out.println("Livro adicionado!");
    }

    public void pegarLivro(int posX, int posY){
        System.out.println("Escolha o livre que deseja alugar com base na posição:");
        System.out.println("Exemplo: Livro: A volta dos que não foram pt.2, Autor: Nei Mato Grosso, De: 1999, Categoria: SUSPENSE, Emprestado: false, Posição: 2 4");
        System.out.println("Exemplo: 2 4");
    }

}
