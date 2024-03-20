package br.com.felipehs.projetouniversidade.core;

public class Questao {
    protected String enunciado;
    protected String resposta;
    public Questao(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String aplicarQuestao(){
        return "Q:" + this.enunciado;
    }

    public boolean corrigir(String resposta){
        return this.resposta.equalsIgnoreCase(resposta);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
