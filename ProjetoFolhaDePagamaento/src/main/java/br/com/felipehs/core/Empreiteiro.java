package br.com.felipehs.core;

public class Empreiteiro extends Funcionario{
    private float valorEmpreteita;

    public Empreiteiro(String nome, int numeroDeRegistro, float valorEmpreteita) {
        super(nome, numeroDeRegistro);
        this.valorEmpreteita = valorEmpreteita;
    }

    @Override
    public float calcularSalario() {
        return valorEmpreteita;
    }

    public float getValorEmpreteita() {
        return valorEmpreteita;
    }

    public void setValorEmpreteita(float valorEmpreteita) {
        this.valorEmpreteita = valorEmpreteita;
    }
}
