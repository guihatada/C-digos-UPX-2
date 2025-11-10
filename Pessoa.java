package MedFacil.java;


public class Pessoa {
    private int id;
    private String nome;
    private String telefone;

    public Pessoa(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getContato() {
        return nome + " - " + telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{id=" + id + ", nome=" + nome + ", telefone=" + telefone + "}";
    }
}