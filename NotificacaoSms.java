
package MedFacil.java;

public class NotificacaoSms extends Notificacao {

    public NotificacaoSms(Pessoa destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("[SMS] Para: " + destinatario.getContato() + " | Mensagem: " + mensagem);
    }
}