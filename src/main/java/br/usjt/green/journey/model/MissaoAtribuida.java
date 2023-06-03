package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.MissaoAtDAO;
import br.usjt.green.journey.dao.PessoaDAO;

public class MissaoAtribuida {

    private boolean finalizada;
    private Missao missao;

    @Override
    public String toString() {
        String titulo = missao.getTitulo();
        return titulo;//"MissaoAtribuida{" + '}';
    }
    
    
    public MissaoAtribuida(){
        missao = new Missao();        
    }
    //construtor que sera usado no metodo de obter missões
    public MissaoAtribuida(int idMissao, boolean finalizada) {
    this.missao = new Missao(idMissao);
    this.finalizada = finalizada;
}
    
    public boolean isFinalizada(int idPessoa) throws Exception {
        MissaoAtDAO dao = new MissaoAtDAO();
       return dao.isFinalizada(idPessoa);
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }

    public void inserirMissaoAt(String username) throws Exception {
        MissaoAtDAO dao = new MissaoAtDAO();
        dao.inserirMissaoAt(username);
    }

    public void concluirMissao(int idUsuario, int idMissao) throws Exception {
        MissaoAtDAO missaoAtDAO = new MissaoAtDAO();
        PessoaDAO pessoaDAO = new PessoaDAO();
        missaoAtDAO.concluirMissao(idUsuario, idMissao);
    }
    public MissaoAtribuida[] obterMissoes(int idPessoa) throws Exception{
        MissaoAtDAO dao = new MissaoAtDAO();
        return dao.obterMissoesAt(idPessoa);
    }
    // metodo que insere as missões a todos os usuarios cadastrados
    public void inserirMissaoAtPorId(int idMissao) throws Exception{
        MissaoAtDAO dao = new MissaoAtDAO();
        dao.inserirMissaoAtPorId(idMissao);
    }   
    
}
