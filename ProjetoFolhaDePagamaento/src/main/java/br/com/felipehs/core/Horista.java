package br.com.felipehs.core;

public class Horista extends Funcionario{
    private float valorHora;
    private int numeroHoras;

    public Horista(String nome, int numeroDeRegistro, float valorHora, int numeroHoras) {
        super(nome, numeroDeRegistro);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    @Override
    public float calcularSalario() {
        return valorHora * numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
}
