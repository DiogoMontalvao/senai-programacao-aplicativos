public class Main {
    public static void main(String[] args) {
        ImovelNovo novo = new ImovelNovo("Rua bobona", 100_000);
        ImovelVelho velho = new ImovelVelho("Rua velinha", 100_000);

        novo.mostraValor();
        velho.mostraValor();
    }
}
