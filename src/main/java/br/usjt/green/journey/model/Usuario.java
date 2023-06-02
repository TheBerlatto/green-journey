package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.PessoaDAO;
import java.util.List;

public class Usuario extends Pessoa {

    private int pontuacao;
    private List<MissaoAtribuida> listaMissoes;
    
    private PessoaDAO pessoaDAO = new PessoaDAO();

    public Usuario() {
        
    }

    public Usuario(int id, String username, String email) {
        super(id, username, email);
    }
    
    public Usuario(String username, String senha) {
        super(username, senha);
    }
    
    public void inserir(String username, String email, String senha) throws Exception {
        this.setUsername(username);
        this.setEmail(email);
        this.setSenha(senha);

        pessoaDAO.inserir(this);
    }
    
    public void deletar(int id) throws Exception{
        pessoaDAO.deletar(id);
    }
    
    public Usuario consultarPorId(int id) throws Exception {
        return pessoaDAO.consultarPorId(id);
    }
    
    public boolean consultarSeExistir(Usuario usuario) throws Exception {
        return pessoaDAO.consultarSeExistir(usuario);
    }
    
    public void alterar(String username, String email, String senha) throws Exception{
        this.setUsername(username);
        this.setEmail(email);
        this.setSenha(senha);
        
        pessoaDAO.alterar(this);
    }
    public int consultarIdPeloUsername(String username) throws Exception{
        return pessoaDAO.consultarIdPeloUsername(username);
    
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
