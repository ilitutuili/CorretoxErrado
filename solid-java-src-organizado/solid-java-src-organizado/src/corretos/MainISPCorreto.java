public class MainISPCorreto {
    public static void main(String[] args) {
        QuadradoISP quadrado = new QuadradoISP(5);
        Cubo cubo = new Cubo(3);

        System.out.println("=== ISP CORRETO ===");
        System.out.println("Classe QuadradoISP executada: área = " + quadrado.calcularArea());
        System.out.println("Classe Cubo executada: área = " + cubo.calcularArea());
        System.out.println("Classe Cubo executada: volume = " + cubo.calcularVolume());
    }
}
