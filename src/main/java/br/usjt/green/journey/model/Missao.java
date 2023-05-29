package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.MissaoDAO;

public class Missao {

    private int id;
    private String titulo;
    private String descricao;
    private int nivelDificuldade;
    private int pontos;

    private MissaoDAO missaoDAO = new MissaoDAO();

    public void inserirMissao(String titulo, String descricao, int nivelDificuldade, int pontos) throws Exception {
        Missao missao = new Missao();
        missao.setTitulo(titulo);
        missao.setDescricao(descricao);
        missao.setNivelDificuldade(nivelDificuldade);
        missao.setPontos(pontos);

        missaoDAO.inserir(missao);
    }

    public Missao consultarMissao(int id) throws Exception {
        return missaoDAO.consultar(id);
    }

    public void alterarMissao(String titulo, String descricao, int nivelDificuldade, int pontos) throws Exception {
        Missao missao = new Missao();
        missao.setTitulo(titulo);
        missao.setDescricao(descricao);
        missao.setNivelDificuldade(nivelDificuldade);
        missao.setPontos(pontos);
        
        missaoDAO.alterar(missao);
    }

    public void deletarMissao(int id) throws Exception {
        missaoDAO.deletar(id);
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

}
