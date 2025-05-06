import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);

        final TV LG = new TV("TV");

        int opcao;
        do {
            mostrarMenu();

            opcao = SCANNER.nextInt();
            executarOpcao(opcao, LG);
        } while (opcao != 0);

        SCANNER.close();
    }

    static void mostrarMenu() {
        System.out.println("\n==========Menu==========");
        System.out.println("Digite uma opção:");
        System.out.println("1: Ligar TV");
        System.out.println("2: Desligar TV");
        System.out.println("3: Aumentar volume");
        System.out.println("4: Diminuir volume");
        System.out.println("5: Trocar canal");
        System.out.println("6: Mudo");
        System.out.println("7: Status");
        System.out.println("0: Encerrar programa");
        System.out.print("Opção: ");
    }

    static void executarOpcao(int opcao, TV tv) {
        switch (opcao) {
            case 1:
                System.out.println("\n" + tv.ligar());
                break;

            case 2:
                System.out.println("\n" + tv.desligar());
                break;

            case 3:
                System.out.println("\n" + tv.aumentarVolume());
                break;

            case 4:
                System.out.println("\n" + tv.diminuirVolume());
                break;

            case 5:
                System.out.println("\n" + tv.trocarCanal());
                break;

            case 6:
                System.out.println("\n" + tv.mudo());
                break;

            case 7:
                System.out.println("\n" + tv.status());
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
