package MedFacil.java;

import java.util.ArrayList;

public class Farmacia {
    private int id;
    private String nome;
    private String endereco;
    private ArrayList<Medicamento> estoque;

    public Farmacia(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.estoque = new ArrayList<>();
    }

    public void adicionarMedicamento(Medicamento m) {
        estoque.add(m);
    }

    public ArrayList<Medicamento> buscarMedicamento(String nome) {     
        ArrayList<Medicamento> resultado = new ArrayList<>();    
        for (Medicamento m : estoque) {
            if (m.getNome().toLowerCase().contains(nome.toLowerCase())) { 
                resultado.add(m);
            }
        }
        return resultado;
    }

    public ArrayList<Medicamento> buscarMedicamento(String nome, double precoMaximo) {
        ArrayList<Medicamento> resultado = new ArrayList<>();
        for (Medicamento m : estoque) {
            if (m.getNome().toLowerCase().contains(nome.toLowerCase()) && m.getPreco() <= precoMaximo) {
                resultado.add(m);
            }
        }
        return resultado;
    }

    public String getNome() { 
        return nome; 
    }
    public String getEndereco() {
         return endereco; 
        }

    @Override
    public String toString() {
        return "Farmácia{" + "id=" + id + ", nome=" + nome + ", endereço=" + endereco + "}";
    }
}