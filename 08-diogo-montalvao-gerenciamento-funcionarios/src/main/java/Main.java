import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> empresa = new ArrayList<>();

        empresa.add(new Gerente("Vitorugo", 20_000.0, "12345"));
        empresa.add(new Desenvolvedor("Karol", 10_000.0));
        empresa.add(new Gerente("Fernanda", 20_000.0, "54321"));
        empresa.add(new Desenvolvedor("Naara", 10_000.0));

        for (Funcionario funcionario : empresa) {
            funcionario.exibirDados();

            if (funcionario instanceof Gerente gerente) {
                if (gerente.autenticar("12345"))
                    System.out.println("Senha correta.");
                else
                    System.out.println("Senha incorreta.");
            }

            System.out.println();
        }

        for (Funcionario funcionario : empresa) {
            if (funcionario.getNome().equals("Naara"))
                System.out.println("Tá viva\n");
        }
    }
}
