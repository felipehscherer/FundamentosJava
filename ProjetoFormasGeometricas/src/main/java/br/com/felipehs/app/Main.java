package br.com.felipehs.app;

import br.com.felipehs.core.Circulo;
import br.com.felipehs.core.Cubo;
import br.com.felipehs.core.Paralelepipedo;
import br.com.felipehs.core.Quadrado;
import br.com.felipehs.model.FormaGeometrica;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[4];

        formas[0] = new Circulo(3.5);
        formas[1] = new Cubo(5);
        formas[2] = new Quadrado(10);
        formas[3] = new Paralelepipedo(4, 4, 4);

        for (FormaGeometrica f: formas){
            System.out.println(f);
        }

    }
}