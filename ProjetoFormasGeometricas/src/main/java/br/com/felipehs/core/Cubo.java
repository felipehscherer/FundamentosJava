package br.com.felipehs.core;

import br.com.felipehs.model.Forma2D;
import br.com.felipehs.model.Forma3D;
import br.com.felipehs.model.FormaGeometrica;

public class Cubo extends FormaGeometrica implements Forma2D, Forma3D {
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2) * 6;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 12;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public String toString() {
        return "Dados do Cubo: Lado= " + lado +
                " Area= " + calcularArea() +
                " Perimetro= " + calcularPerimetro() +
                " Volume= " + calcularVolume();
    }
}
