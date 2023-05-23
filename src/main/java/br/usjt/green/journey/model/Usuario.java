package br.usjt.green.journey.model;

import java.util.List;

public class Usuario extends Pessoa {

    private long Id;
    private int pontuacao;
    private List<MissaoAtribuida> listaMissoes;
    
    public void concluirMissao(){
        
    }
    
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
