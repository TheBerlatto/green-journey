package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.MissaoAtDAO;

public class MissaoAtribuida {

    private boolean finalizada;
    private Missao missao;
    
    
    public MissaoAtribuida(){
        
    }
    //construtor que sera usado no metodo de obter missões
    public MissaoAtribuida(int idMissao, boolean finalizada) {
    this.missao = new Missao(idMissao);
    this.finalizada = finalizada;
}
    
    public boolean isFinalizada(int idPessoa) throws Exception {
        MissaoAtDAO dao = new MissaoAtDAO();
        dao.isFinalizada(idPessoa);
        return false;
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
        MissaoAtDAO dao = new MissaoAtDAO();
        dao.concluirMissao(idUsuario, idMissao);
    }
}
