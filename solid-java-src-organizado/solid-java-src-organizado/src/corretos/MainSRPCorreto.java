public class MainSRPCorreto {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria", 50.0, 8);
        CalculadoraSalario calculadora = new CalculadoraSalario();
        FuncionarioRepository repository = new FuncionarioRepository();
        EmailServiceSRP emailService = new EmailServiceSRP();

        System.out.println("=== SRP CORRETO ===");
        System.out.println("Classe Funcionario executada");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Classe CalculadoraSalario executada");
        System.out.println("Salário calculado: " + calculadora.calcular(funcionario));
        System.out.println("Classe FuncionarioRepository executada");
        repository.salvar(funcionario);
        System.out.println("Classe EmailServiceSRP executada");
        emailService.enviar(funcionario);
    }
}
