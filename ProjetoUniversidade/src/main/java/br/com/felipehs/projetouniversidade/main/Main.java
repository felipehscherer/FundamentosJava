package br.com.felipehs.projetouniversidade.main;

import br.com.felipehs.projetouniversidade.core.Questao;
import br.com.felipehs.projetouniversidade.core.QuestaoComDica;
import br.com.felipehs.projetouniversidade.core.QuestaoMultiplaEscolha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pontos = 0;
        String respostaDoAluno;

        Questao[] questoes = new Questao[5];
        questoes[0] = new QuestaoComDica("1 + 1?", "2", "Resposta tem que ser numérica!");
        questoes[1] = new QuestaoMultiplaEscolha("Qual a formula da agua?", "B", "h20", "h2o", "mineral", "potavel");
        questoes[2] = new Questao("Quem descobriu o Brasil?", "Pedro Alvarez Cabral");
        questoes[3] = new Questao("Qual a melhor linguagem?", "Java");
        questoes[4] = new QuestaoComDica("Qual a versão do SDK?", "21", "Ultima versão");

        for (Questao q: questoes) {
            System.out.println(q.aplicarQuestao());
            respostaDoAluno = sc.nextLine();
            if (q.corrigir(respostaDoAluno)){
                System.out.println("Acertou!!");
                pontos++;
            } else {
                System.out.println("Errouuu!");
            }
        }

        System.out.println("Total de acertos: " + pontos);


    }
}
