public class Cubo implements Forma2D, Forma3D {
    private double lado;

    public Cubo(double lado) {
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
