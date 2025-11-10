
package MedFacil.java;


import java.util.ArrayList;

public class Pedido {
    private int id;
    private Usuario usuario;
    private Farmacia farmacia;
    private ArrayList<ItemPedido> itens;
    private boolean entregue;

    public Pedido(int id, Usuario usuario, Farmacia farmacia) {
        this.id = id;
        this.usuario = usuario;
        this.farmacia = farmacia;
        this.itens = new ArrayList<>();
        this.entregue = false;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double getTotal() {
        double soma = 0;
        for (ItemPedido item : itens) {
            soma += item.getValorTotal();
        }
        return soma;
    }

    public void marcarComoEntregue() {
        this.entregue = true;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", usuário=" + usuario.getEmail() + ", farmácia=" + farmacia.getNome() +
                ", total=R$ " + getTotal() + "}";
    }
}