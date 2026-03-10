public class MainProjeto {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" DEMONSTRAÇÃO DOS PRINCÍPIOS SOLID ");
        System.out.println("====================================");

        MainSRPCorreto.main(args);
        System.out.println();

        MainOCPCorreto.main(args);
        System.out.println();

        MainLSPCorreto.main(args);
        System.out.println();

        MainISPCorreto.main(args);
        System.out.println();

        MainDIPCorreto.main(args);

        System.out.println();
        System.out.println("====================================");
        System.out.println("FINAL DA EXECUÇÃO");
        System.out.println("Todos os princípios foram demonstrados.");
        System.out.println("====================================");
    }
}
