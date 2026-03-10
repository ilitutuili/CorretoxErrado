public class DescontoPremium implements Desconto {
    @Override
    public double calcular(double valorCompra) {
        return valorCompra * 0.10;
    }
}
