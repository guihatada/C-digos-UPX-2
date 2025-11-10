
package MedFacil.java;

public abstract class Notificacao {
    protected Pessoa destinatario;
    protected String mensagem;

    public Notificacao(Pessoa destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public abstract void enviar();
}