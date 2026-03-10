public class CalculadoraDesconto {
    public double calcular(double valorCompra, Desconto desconto) {
        return desconto.calcular(valorCompra);
    }
}
