public class QuadradoISPErrado implements FormaErrada {
    private double lado;

    public QuadradoISPErrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularVolume() {
        throw new UnsupportedOperationException("Quadrado não possui volume.");
    }
}
