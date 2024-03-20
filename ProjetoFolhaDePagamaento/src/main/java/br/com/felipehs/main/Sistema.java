package br.com.felipehs.main;

import br.com.felipehs.core.*;

public class Sistema {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Horista("Joao", 1234, 8.5F, 10);
        funcionarios[1] = new Empreiteiro("Pedro", 5678, 3500);
        funcionarios[2] = new Comissionado("Carlos", 5674, 1500, 13.5F);
        funcionarios[3] = new Chefe("Felipe", 1, 10500, 3900, 2200);

        for (Funcionario f: funcionarios){
            System.out.println("Nome: " + f.getNome() + "\n" +
                    "REG: " + f.getNumeroDeRegistro() + "\n" +
                    "SALARIO: " + f.calcularSalario());
            System.out.println("==========================");
        }
    }
}
