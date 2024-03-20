package br.com.felipehs.core;

public class Comissionado extends Funcionario{
    private float salarioBase;
    private float comissao;

    public Comissionado(String nome, int numeroDeRegistro, float salarioBase, float comissao) {
        super(nome, numeroDeRegistro);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario() {
        return salarioBase + salarioBase * comissao / 100;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
