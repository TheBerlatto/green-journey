package br.usjt.green.journey.model;

public class Administrador extends Pessoa {
    
    private int codAdmin;

    public Administrador(String username, String senha) {
        super(username, senha);
    }

    public int getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(int codAdmin) {
        this.codAdmin = codAdmin;
    }
}
