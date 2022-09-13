package top.rregio.Modelos;
import java.util.List;

public class Contato {
    private int id;
    private String nome;
    private int intimidade;
    private int idUsuario;
    private List<FormaContato> formasDeContato;

    public int getId() { return id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public int getIntimidade() { return intimidade; }
    public void setIntimidade(int intimidade) {
        this.intimidade = intimidade; }
    
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    
    public List<FormaContato> getFormasDeContato() {
        return formasDeContato; }
    public void setFormasDeContato(List<FormaContato> formasDeContato) {
        this.formasDeContato = formasDeContato; }
}
