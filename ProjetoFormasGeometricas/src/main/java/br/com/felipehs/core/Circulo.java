package br.com.felipehs.core;

import br.com.felipehs.model.Forma2D;
import br.com.felipehs.model.FormaGeometrica;

public class Circulo extends FormaGeometrica implements Forma2D {
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(this.raio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return "Dados do Circulo: Raio= " + raio + " Area= " + calcularArea() + " Perimetro= " + calcularPerimetro();
    }
}
