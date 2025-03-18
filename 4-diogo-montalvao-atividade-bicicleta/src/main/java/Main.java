import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Acessorio paralama = new Acessorio("Paralama", "Do bão", "Plástico", 30.0);
        Bicicleta monark = new Bicicleta(
                "Monark",
                "Transporta Idoso",
                "Cargueira",
                600.0,
                paralama
        );

        System.out.println(monark.exibirDetalhes());
        System.out.println("\n" + paralama.exibirDetalhes());
        System.out.printf(
                "\nO valor total da bicicleta %s %s com o %s de %s ficou de: R$ %.2f\n",
                monark.getMarca(), monark.getModelo(), paralama.getTipo(),
                paralama.getMaterial(), monark.calculaValorTotal());

        Acessorio capacete = new Acessorio("Capacete", "GTA", "Plástico", 80.0);
        Bicicleta caloi = new Bicicleta(
                "Caloi",
                "Vulcan",
                "Mountain Bike",
                1200.0,
                capacete
        );

        System.out.println("\n" + caloi.exibirDetalhes());
        System.out.println("\n" + capacete.exibirDetalhes());
        System.out.printf(
                "\nO valor total da bicicleta %s %s com o %s de %s ficou de: R$ %.2f\n",
                caloi.getMarca(), caloi.getModelo(), capacete.getTipo(),
                capacete.getMaterial(), caloi.calculaValorTotal());
    }
}
