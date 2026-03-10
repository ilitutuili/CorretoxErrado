public class CalculadoraSalario {
    public double calcular(Funcionario funcionario) {
        return funcionario.getValorHora() * funcionario.getHorasTrabalhadas();
    }
}
