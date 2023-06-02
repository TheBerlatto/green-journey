package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.MissaoDAO;

public class Missao {

    private int id;
    private String titulo;
    private String descricao;
    private int nivelDificuldade;
    private int pontos;

    private MissaoDAO missaoDAO = new MissaoDAO();

    public Missao() {
        
    }
    //logica para a tela de catalogo relacionada ao missaoAT
    //codigo modificado! construtor que recebe o id como parametro
    public Missao(int id){
    
    }

    public Missao(int id, String titulo, String descricao, int nivelDificuldade, int pontos) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivelDificuldade = nivelDificuldade;
        this.pontos = pontos;
    }

    public void inserirMissao(String titulo, String descricao, int nivelDificuldade, int pontos) throws Exception {
        Missao missao = new Missao();
        missao.setTitulo(titulo);
        missao.setDescricao(descricao);
        missao.setNivelDificuldade(nivelDificuldade);
        missao.setPontos(pontos);

        missaoDAO.inserir(missao);
    }

    public Missao consultarMissaoPorId(int id) throws Exception {
        return missaoDAO.consultarPorId(id);
    }

    public void alterarMissao(String titulo, String descricao, int nivelDificuldade, int pontos) throws Exception {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setNivelDificuldade(nivelDificuldade);
        this.setPontos(pontos);
        
        missaoDAO.alterar(this);
    }

    public void deletarMissao(int id) throws Exception {
        missaoDAO.deletar(id);
    }
    public int consultarIdPeloTitulo(String titulo)throws Exception{
        return missaoDAO.consultarIdPeloTitulo(titulo);
    
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
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

    @Override
    public String toString() {
        return this.titulo;
    }

    
}
