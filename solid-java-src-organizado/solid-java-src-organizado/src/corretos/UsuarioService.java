public class UsuarioService {
    private Notificador notificador;

    public UsuarioService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificarUsuario() {
        notificador.enviarMensagem("Bem-vindo ao sistema!");
    }
}
