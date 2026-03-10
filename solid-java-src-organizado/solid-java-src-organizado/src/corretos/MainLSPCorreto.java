public class MainLSPCorreto {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 4);
        Forma quadrado = new Quadrado(4);

        System.out.println("=== LSP CORRETO ===");
        System.out.println("Classe Retangulo executada: área = " + retangulo.getArea());
        System.out.println("Classe Quadrado executada: área = " + quadrado.getArea());
    }
}
