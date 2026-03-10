public class FuncionarioSRPErrado {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioSRPErrado(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    public void salvarNoBanco() {
        System.out.println("Salvando funcionário " + nome + " no banco...");
    }

    public void enviarEmail() {
        System.out.println("Enviando e-mail para " + nome + "...");
    }
}
