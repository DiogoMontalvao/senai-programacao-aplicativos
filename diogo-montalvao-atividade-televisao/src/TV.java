import java.util.*;

public class TV {
    final Scanner SCANNER = new Scanner(System.in);

    final int VOLUME_MINIMO = 0;
    final int VOLUME_MAXIMO = 100;
    final int CANAL_MINIMO = 1;
    final int CANAL_MAXIMO = 999;

    String marca = "";
    int volume = 0;
    int canalAtual = 1;
    boolean ligada = false;

    public TV() {

    }

    public TV(String marca) {
        this.marca = marca;
    }

    String ligar() {
        this.ligada = true;
        return "TV ligada.";
    }

    String desligar() {
        this.ligada = false;
        return "TV desligada.";
    }

    String aumentarVolume() {
        if (!this.ligada)
            return "TV desligada.";

        if (this.volume == this.VOLUME_MAXIMO)
            return "Volume máximo atingido.";

        this.volume += 10;
        return String.format("Volume: %s", this.volume);
    }

    String diminuirVolume() {
        if (!this.ligada)
            return "TV desligada.";

        if (this.volume == this.VOLUME_MINIMO)
            return "TV no mudo.";

        this.volume -= 10;
        return String.format("Volume: %s", this.volume);
    }

    String trocarCanal() {
        if (!this.ligada)
            return "TV desligada.";

        System.out.print("\nDigite o canal desejado: ");
        int novoCanal = SCANNER.nextInt();

        if (novoCanal < this.CANAL_MINIMO || novoCanal > this.CANAL_MAXIMO)
            return "Número do canal inválido.";

        this.canalAtual = novoCanal;
        return String.format("Novo canal: %s", this.canalAtual);
    }

    String mudo() {
        if (!this.ligada)
            return "TV desligada.";

        this.volume = this.VOLUME_MINIMO;
        return "TV no mudo.";
    }

    String status() {
        if (!this.ligada)
            return "TV desligada.";

        return String.format("%s, TV ligada, canal %s, volume %s", this.marca, this.canalAtual, this.volume);
    }
}
