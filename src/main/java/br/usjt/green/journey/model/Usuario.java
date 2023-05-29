package br.usjt.green.journey.model;

import br.usjt.green.journey.dao.PessoaDAO;
import java.util.List;

public class Usuario extends Pessoa {

    private int pontuacao;
    private List<MissaoAtribuida> listaMissoes;
    
    private PessoaDAO pessoaDAO = new PessoaDAO();

    public Usuario() {
        
    }
    
    public Usuario(String username, String senha) {
        super(username, senha);
    }
    
    public void inserir(String username, String email, String senha) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setEmail(email);
        usuario.setSenha(senha);

        pessoaDAO.inserir(usuario);
    }
    
    public void deletar(int id) throws Exception{
        pessoaDAO.deletar(id);
    }
    
    public Usuario consultar(int id) throws Exception {
        return pessoaDAO.consultar(id);
    }
    
    public void alterar(String username, String email, String senha) throws Exception{
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        
        pessoaDAO.alterar(usuario);
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
