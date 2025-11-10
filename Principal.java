
package MedFacil.java;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Farmacia farmacia = new Farmacia(1, "Drogaria Central", "Av. Principal, 100");
        Medicamento m1 = new Medicamento(1, "Dipirona 500mg", "Analgésico", 5.90);
        Medicamento m2 = new Medicamento(2, "Paracetamol 500mg", "Analgésico", 7.50);
        farmacia.adicionarMedicamento(m1);
        farmacia.adicionarMedicamento(m2);

        Usuario maria = new Usuario(1, "Maria Helena", "(15)99999-0000", "maria@email.com");

        ArrayList<Medicamento> busca = farmacia.buscarMedicamento("dipirona");
        System.out.println("Busca por 'dipirona': " + busca);

        Pedido pedido1 = new Pedido(1, maria, farmacia);
        pedido1.adicionarItem(new ItemPedido(m1, 2));
        pedido1.adicionarItem(new ItemPedido(m2, 1));
        maria.adicionarPedido(pedido1);

        System.out.println("Pedido criado: " + pedido1);

        Notificacao n1 = new NotificacaoApp(maria, "Seu pedido foi confirmado!");
        Notificacao n2 = new NotificacaoSms(maria, "Seu pedido está pronto para retirada!");
        n1.enviar();
        n2.enviar();

        maria.lembrarMedicamento();
        maria.lembrarMedicamento("Tomar Dipirona às 20h.");
    }
}