public class EmailService implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
