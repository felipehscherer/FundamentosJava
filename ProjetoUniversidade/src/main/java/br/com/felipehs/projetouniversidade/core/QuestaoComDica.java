package br.com.felipehs.projetouniversidade.core;

public class QuestaoComDica extends Questao{

    private String dica;
    public QuestaoComDica(String enunciado, String resposta, String dica) {
        super(enunciado, resposta);
        this.dica = dica;
    }

    @Override
    public String aplicarQuestao() {
        return super.aplicarQuestao() + "\n" + "Dica: " + dica;
    }
}
