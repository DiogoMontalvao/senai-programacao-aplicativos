import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        primeiraQuestao();
        System.out.println();
        segundaQuestao();
    }

    static void primeiraQuestao() {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i + 1);
        }

        System.out.println(numeros);
    }

    static void segundaQuestao() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Vito");
        nomes.add("Karol");
        nomes.add("Naara");
        nomes.add("Fernanda");
        nomes.add("Batman");

        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }
    }
}
