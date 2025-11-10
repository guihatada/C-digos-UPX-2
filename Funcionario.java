package MedFacil.java;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(int id, String nome, String telefone, String cargo) {
        super(id, nome, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Funcionário{" + "id=" + getId() + ", nome=" + getNome() + ", cargo=" + cargo + "}";
    }
}