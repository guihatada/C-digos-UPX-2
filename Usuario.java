package MedFacil.java;


import java.util.ArrayList;

public class Usuario extends Pessoa {
    private String email;
    private ArrayList<Pedido> pedidos;

    public Usuario(int id, String nome, String telefone, String email) {
        super(id, nome, telefone);
        this.email = email;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido p) {
        pedidos.add(p);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public String getEmail() {
        return email;
    }

    public void lembrarMedicamento() {
        lembrarMedicamento("Hora de tomar seu medicamento.");
    }

    public void lembrarMedicamento(String mensagem) {
        Notificacao notif = new NotificacaoApp(this, mensagem);
        notif.enviar();
    }

    @Override
    public String toString() {
        return "Usuário{" + "id=" + getId() + ", nome=" + getNome() + ", email=" + email + "}";
    }
}