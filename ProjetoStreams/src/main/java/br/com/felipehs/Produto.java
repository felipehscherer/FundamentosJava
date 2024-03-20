package br.com.felipehs;

public class Produto {
    private String nome;
    private int quantiaEmEstoque;
    private double valor;

    public Produto(String nome, int quantiaEmEstoque, double valor){
        this.nome = nome;
        this.quantiaEmEstoque = quantiaEmEstoque;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantiaEmEstoque=" + quantiaEmEstoque +
                ", valor=" + valor +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantiaEmEstoque() {
        return quantiaEmEstoque;
    }

    public void setQuantiaEmEstoque(int quantiaEmEstoque) {
        this.quantiaEmEstoque = quantiaEmEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
