package br.usjt.green.journey.model;

public class Missao {

    private long id;
    private String titulo;
    private String descricao;
    private int nivelDificuldade;
    private int pontos;
    
    public void incluirMissao() {
        
    }
    
    public void consultarMissoes(){
        
    }
    
    public void alterarMissao() {
        
    }
    
    public void excluirMissao() {
        
    }
    
    public long getId() {
        return id;
    }

    public void setId(long Id) {
        this.id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
}
