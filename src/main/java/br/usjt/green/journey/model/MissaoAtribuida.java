package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.MissaoAtDAO;

public class MissaoAtribuida {

    private boolean finalizada;
    private Missao missao;

    public boolean isFinalizada() {
        return finalizada;
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
       public void alterarEstado(int idUsuario, int idMissao) throws Exception {
        MissaoAtDAO dao = new MissaoAtDAO();
        dao.alterarEstado(idUsuario, idMissao);
    }
}
