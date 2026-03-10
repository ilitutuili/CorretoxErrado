public class QuadradoISP implements Forma2D {
    private double lado;

    public QuadradoISP(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
