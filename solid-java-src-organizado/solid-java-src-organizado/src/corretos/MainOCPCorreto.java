public class MainOCPCorreto {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        System.out.println("=== OCP CORRETO ===");
        System.out.println("Classe CalculadoraDesconto executada");
        System.out.println("Classe DescontoComum executada: " + calculadora.calcular(1000.0, new DescontoComum()));
        System.out.println("Classe DescontoPremium executada: " + calculadora.calcular(1000.0, new DescontoPremium()));
        System.out.println("Classe DescontoVip executada: " + calculadora.calcular(1000.0, new DescontoVip()));
    }
}
