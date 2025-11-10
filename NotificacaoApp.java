
package MedFacil.java;

public class NotificacaoApp extends Notificacao {

    public NotificacaoApp(Pessoa destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("[App] Para: " + destinatario.getContato() + " | Mensagem: " + mensagem);
    }
}