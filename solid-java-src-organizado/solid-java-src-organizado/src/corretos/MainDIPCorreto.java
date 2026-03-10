public class MainDIPCorreto {
    public static void main(String[] args) {
        UsuarioService usuarioEmail = new UsuarioService(new EmailService());
        UsuarioService usuarioSms = new UsuarioService(new SmsService());

        System.out.println("=== DIP CORRETO ===");
        System.out.println("Classe UsuarioService executada com EmailService");
        usuarioEmail.notificarUsuario();
        System.out.println("Classe UsuarioService executada com SmsService");
        usuarioSms.notificarUsuario();
    }
}
