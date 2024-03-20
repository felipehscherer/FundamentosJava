package br.com.felipehs;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Cliente> lista;
        lista = new ArrayList<>();

        lista.add(new Cliente(1, "Felipe HS", "felipehs@gmail.com", true));
        lista.add(new Cliente(2, "Fe", "felipehs@gmail.com", false));
        lista.add(new Cliente(3, "lipe", "felipehs@gmail.com", true));
        lista.add(new Cliente(4, "Feli", "felipehs@gmail.com", true));
        lista.add(new Cliente(5, "Felipe", "felipehs@gmail.com", true));
        lista.add(new Cliente(6, "Fepe", "felipehs@gmail.com", false));
        lista.add(new Cliente(7, "Fefe", "felipehs@gmail.com", true));
        lista.add(new Cliente(8, "Feipe", "felipehs@gmail.com", false));
        lista.add(new Cliente(9, "Felip", "felipehs@gmail.com", false));
        lista.add(new Cliente(10, "Felp", "felipehs@gmail.com", true));

        System.out.println("------TUDAO------");
        lista.forEach(System.out::println);
        System.out.println("-------APENAS ATIVOS--------");
        exibePorCriterio(lista, Cliente::isAtivo);
        System.out.println("------MAIS DE 4 LETRAS NO NOME");
        exibePorCriterio(lista, c -> c.getNome().length() > 4);
    }

    public static void exibePorCriterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate){
        lista.forEach(c -> {
            if (predicate.test(c))
                System.out.println(c);
        });
    }
}
