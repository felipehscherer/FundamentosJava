package org.example;

public class Conta {
    private int numeroDaConta;
    private int digitoVerificador;
    private String nomeDoTitular;
    private String cpf;
    private double saldo;

    public void depositar(int valorDeDeposito){
        this.saldo += valorDeDeposito;
    }
    public boolean sacar(int valorDeSaque){
        if (valorDeSaque > saldo){
            return false;
        } else {
            this.saldo -= valorDeSaque;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta: " +
                "Numero Da Conta= " + numeroDaConta +
                ", Digito Verificador= " + digitoVerificador +
                ", Nome Do Titular= " + nomeDoTitular +
                ", CPF= " + cpf +
                ", Saldo= " + saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

}
