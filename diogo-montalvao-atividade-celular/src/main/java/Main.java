public class Main {

    public static void main(String[] args) {
        Capa capinha = new Capa("Transparente", "Plástico", 20.00);

        Celular celuliro = new Celular(
                "Samsung",
                "S23",
                "Preto",
                2000.00,
                capinha
        );

        System.out.println(celuliro.calcularTotal());
    }
}
