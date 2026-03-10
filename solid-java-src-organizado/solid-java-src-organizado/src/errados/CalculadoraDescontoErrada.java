public class CalculadoraDescontoErrada {
    public double calcular(String tipoCliente, double valorCompra) {
        if (tipoCliente.equalsIgnoreCase("comum")) {
            return valorCompra * 0.05;
        } else if (tipoCliente.equalsIgnoreCase("premium")) {
            return valorCompra * 0.10;
        } else if (tipoCliente.equalsIgnoreCase("vip")) {
            return valorCompra * 0.15;
        }
        return 0;
    }
}
