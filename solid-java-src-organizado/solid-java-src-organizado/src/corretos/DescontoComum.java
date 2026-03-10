public class DescontoComum implements Desconto {
    @Override
    public double calcular(double valorCompra) {
        return valorCompra * 0.05;
    }
}
