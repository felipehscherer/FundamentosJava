package br.com.felipehs.core;

import br.com.felipehs.model.Forma3D;
import br.com.felipehs.model.FormaGeometrica;

public class Paralelepipedo extends FormaGeometrica implements Forma3D {
    private double altura;
    private double largura;
    private double profundidade;

    public Paralelepipedo(double altura, double largura, double profundidade){
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }
    @Override
    public double calcularVolume() {
        return this.altura * this.largura + this.profundidade;
    }

    @Override
    public String toString() {
        return "Dados do Paralelepipedo: Medidas= A:" + this.altura +
                " L:" + this.largura + " P:" + this.profundidade + " Volume= " + calcularVolume();
    }
}
