public class DescontoVip implements Desconto {
    @Override
    public double calcular(double valorCompra) {
        return valorCompra * 0.15;
    }
}
