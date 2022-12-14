package top.rregio.Modelos;

import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String bio;
    private List<Contato> listaContatos;

    public int getId(){ return id; }
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
    public String getSenha(){ return senha; }
    public void setSenha(String senha){ this.senha = senha; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public List<Contato> getListaContatos(){ return listaContatos; }
    public void setListaContatos(List<Contato> listaContatos){
        this.listaContatos = listaContatos; }
}
