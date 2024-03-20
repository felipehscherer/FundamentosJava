package br.com.felipehs.core;

import br.com.felipehs.model.Forma2D;
import br.com.felipehs.model.FormaGeometrica;

public class Quadrado extends FormaGeometrica implements Forma2D {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Dados do Quadrado: Lado= " + lado + "Area= " + calcularArea() + "Perimetro= " + calcularArea();
    }
}
