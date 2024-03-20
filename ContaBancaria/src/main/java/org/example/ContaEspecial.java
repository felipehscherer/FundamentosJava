package org.example;

public class ContaEspecial extends Conta{
    private double FaturaSaqueEspecial;

    public void sacar(double saque){
        this.FaturaSaqueEspecial += saque;
    }

}
