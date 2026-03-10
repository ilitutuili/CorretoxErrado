public class CuboISPErrado implements FormaErrada {
    private double lado;

    public CuboISPErrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }
}
