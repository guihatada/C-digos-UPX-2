
package MedFacil.java;

public class Medicamento {
    private int id;
    private String nome;
    private String descricao;
    private double preco;

    public Medicamento(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() { 
        return id; 
    }
    
    public String getNome() { 
        return nome; 
    }
    
    public String getDescricao() { 
        return descricao;
     }
    
     public double getPreco() { 
        return preco; 
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nome=" + nome + ", preço=" + preco + "}";
    }
}