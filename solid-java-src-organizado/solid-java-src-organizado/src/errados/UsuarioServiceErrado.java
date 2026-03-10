public class UsuarioServiceErrado {
    private EmailServiceErrado emailService = new EmailServiceErrado();

    public void notificarUsuario() {
        emailService.enviarEmail("Bem-vindo ao sistema!");
    }
}
