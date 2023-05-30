package br.usjt.green.journey.model;

public class Pessoa {

    private int id;
    private String username;
    private String email;
    private String senha;

    public Pessoa() {
        
    }
    
    public Pessoa(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public Pessoa(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
}
