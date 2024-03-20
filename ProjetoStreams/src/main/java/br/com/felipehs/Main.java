package br.com.felipehs;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 100, 1350));
        lista.add(new Produto("Mouse", 15, 98.90));
        lista.add(new Produto("Teclado", 20, 139.90));
        lista.add(new Produto("Monitor", 50, 799));
        lista.add(new Produto("MousePad", 20, 27.90));

        System.out.println("Produtos com estoque grande(p >= 100)");
        lista.stream().filter(produto -> produto.getQuantiaEmEstoque() >= 100)
                .forEach(System.out::println);


    }
}