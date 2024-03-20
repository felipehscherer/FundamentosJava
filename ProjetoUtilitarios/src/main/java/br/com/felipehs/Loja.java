package br.com.felipehs;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        ArrayList<Produto> lista;
        lista = new ArrayList<>();

        lista.add(new Produto(1, "Teclado", 130));
        lista.add(new Produto(2, "Fone", 232));
    }
}
