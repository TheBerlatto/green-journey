package br.usjt.green.journey.model;

import java.util.List;

public class Usuario extends Pessoa {

    private int pontuacao;
    private List<MissaoAtribuida> listaMissoes;

    public Usuario(String username, String senha) {
        super(username, senha);
    }
        
    public void concluirMissao(){
        
    }

    public int getPontuacao() {
        return pontuacao;
    }

    /*a pontuação deve ser recebida da lista de missões, verificando cada missão
    se ela foi concluida ou não, se ela foi então atribuir os pontos a esse atributo*/
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
