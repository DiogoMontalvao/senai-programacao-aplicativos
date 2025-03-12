import java.util.Scanner;

public class Main {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final Livro livro = new Livro("Harry Porta", "JK", 300);

        int opcao;
        do {
            mostrarMenu();

            opcao = SCANNER.nextInt();
            executarOpcao(opcao, livro);
        } while (opcao != 0);

        SCANNER.close();
    }

    static void mostrarMenu() {
        System.out.println("\n==========Menu==========");
        System.out.println("Digite uma opção:");
        System.out.println("1: Emprestar livro");
        System.out.println("2: Devolver livro");
        System.out.println("3: Status");
        System.out.println("4: Alterar número de páginas");
        System.out.println("0: Encerrar programa");
        System.out.print("Opção: ");
    }

    static void executarOpcao(int opcao, Livro livro) {
        switch (opcao) {
            case 1:
                System.out.println("\n" + livro.emprestar());
                break;

            case 2:
                System.out.println("\n" + livro.devolver());
                break;

            case 3:
                System.out.println("\n" + livro.status());
                break;

            case 4:
                System.out.print("\nInforme o número de páginas: ");
                int numeroPaginas = SCANNER.nextInt();

                System.out.println("\n" + livro.setNumeroPaginas(numeroPaginas));
                break;

            case 0:
                System.out.println("\nEncerrando o programa...");
                break;

            default:
                System.out.println("\nOpção inválida.");
                break;
        }
    }
}
