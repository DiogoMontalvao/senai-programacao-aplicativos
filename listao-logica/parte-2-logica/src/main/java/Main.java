import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        questao4CalculaArea(5);
//        questao5CalculaAreaTriangulo(10,5);
//        questao6NomeCompleto();
//        questao7Soma();
//        questao8Contracheque();
//        questao9ConverteCelsiusFahrenheit();
//        questao10ConverteFahrenheitCelsius();
//        questao11VolumeLata(10, 20);
//        questao12ConsumoViagem(2, 100);
//        questao13TrocaValores();
//        questao14SomaMultiplica();
//        questao15CaixaRetangular();
//        questao16QuadradoCubo();
//        questao17QuadradoSoma();
//        questao18SomaQuadrado();
//        questao19CalculaMedia();
//        questao20ReverteOrdem();
//        questao21QuilometroMs();
        questao22Resto();
    }

    static void questao4CalculaAreaCircunferencia(double diametro) {
        final double PI = 3.14159;

        double raio = diametro / 2;
        double area = PI * (raio * raio);

        System.out.printf("A área da circunferência é: %.1f\n", area);
    }

    static void questao5CalculaAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2.0;

        System.out.printf("A área do triângulo é: %.1f\n", area);
    }

    static void questao6NomeCompleto() {
        System.out.print("Digite um nome: ");
        String nome = scanner.next();

        System.out.print("Digite um sobrenome: ");
        String sobrenome = scanner.next();

        String nomeCompleto = String.format("Nome completo: %s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    static void questao7Soma() {
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.printf("Soma: %d\n", soma);
    }

    static void questao8Contracheque() {
        System.out.print("Digite as horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o percentual do desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;
        double descontoSalario = (percentualDesconto / 100.0) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoSalario;

        System.out.printf("""
                Horas trabalhadas: %.2f
                Salário bruto: %.2f
                Desconto: %.2f
                Salário líquido: %.2f
                
                """, horasTrabalhadas, salarioBruto, descontoSalario, salarioLiquido);
    }

    static void questao9ConverteCelsiusFahrenheit() {
        System.out.print("Digite a temperatura em graus Celsius: ");
        double grausCelsius = scanner.nextDouble();

        double grausFahrenheit = (9.0 * grausCelsius + 160.0) / 5.0;

        System.out.printf("Temperatura em Fahrenheit: %.1f\n", grausFahrenheit);
    }

    static void questao10ConverteFahrenheitCelsius() {
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double grausFahrenheit = scanner.nextDouble();

        double grausCelsius = (grausFahrenheit - 32.0) * (5.0 / 9.0);

        System.out.printf("Temperatura em Celsius: %.1f\n", grausCelsius);
    }

    static void questao11VolumeLata(double diametro, double altura) {
        final double PI = 3.14159;

        double raio = diametro / 2;
        double volume = PI * (raio * raio) * altura;

        System.out.printf("O volume da lata é: %.1f\n", volume);
    }

    static void questao12ConsumoViagem(int tempo, int velocidadeMedia) {
        final int KM_LITRO = 12;

        int distanciaPercorrida = tempo * velocidadeMedia;
        int consumoMedio = distanciaPercorrida / KM_LITRO;

        System.out.printf("Consumo de combustível: %d L\n", consumoMedio);
    }

    static void questao13TrocaValores() {
        System.out.print("Digite o primeiro valor: ");
        String primeiroValor = scanner.next();

        System.out.print("Digite o segundo valor: ");
        String segundoValor = scanner.next();

        String temp = primeiroValor;
        primeiroValor = segundoValor;
        segundoValor = temp;

        System.out.printf("Primeiro valor: %s, segundo valor: %s\n", primeiroValor, segundoValor);
    }

    static void questao14SomaMultiplica() {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int terceiro = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int quarto = scanner.nextInt();

        System.out.printf("Primeiro + segundo = %d / Primeiro * segundo = %d\n", primeiro + segundo, primeiro * segundo);
        System.out.printf("Primeiro + terceiro = %d / Primeiro * terceiro = %d\n", primeiro + terceiro, primeiro * terceiro);
        System.out.printf("Primeiro + quarto = %d / Primeiro * quarto = %d\n", primeiro + quarto, primeiro * quarto);
        System.out.printf("segundo + terceiro = %d / segundo * terceiro = %d\n", segundo + terceiro, segundo * terceiro);
        System.out.printf("segundo + quarto = %d / segundo * quarto = %d\n", segundo + quarto, segundo * quarto);
        System.out.printf("terceiro + quarto = %d / terceiro * quarto = %d\n", terceiro + quarto, terceiro * quarto);
    }

    static void questao15CaixaRetangular() {
        System.out.print("Digite o comprimento: ");
        int comprimento = scanner.nextInt();

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();

        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();

        int volumeCaixa = comprimento * largura * altura;
        System.out.printf("Volume da caixa retangular: %d\n", volumeCaixa);
    }

    static void questao16QuadradoCubo() {
        System.out.print("Digite um número: ");
        int primeiro = scanner.nextInt();

        int quadrado = primeiro * primeiro;
        int cubo = primeiro * primeiro * primeiro;

        System.out.printf("Quadrado: %d\n", quadrado);
        System.out.printf("Cubo: %d\n", cubo);
    }

    static void questao17QuadradoSoma() {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        int soma = primeiro + segundo;
        int quadrado = soma * soma;

        System.out.printf("Quadrado da soma: %d\n", quadrado);
    }

    static void questao18SomaQuadrado() {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        int quadradoPrimeiro = primeiro * primeiro;
        int quadradoSegundo = segundo * segundo;
        int soma = quadradoPrimeiro + quadradoSegundo;

        System.out.printf("Soma do quadrado: %d\n", soma);
    }

    static void questao19CalculaMedia() {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        double media = (primeiro + segundo) / 2.0;
        System.out.printf("Média dos números: %.1f\n", media);
    }

    static void questao20ReverteOrdem() {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        System.out.printf("Números: %d %d\n", segundo, primeiro);
    }

    static void questao21QuilometroMs() {
        System.out.print("Digite a velocidade em km/h: ");
        double velocidadeKm = scanner.nextDouble();

        double velocidadeMs = velocidadeKm / 3.6;

        System.out.printf("Velocidade convertida: %.0f m/s\n", velocidadeMs);
    }

    static void questao22Resto() {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        int resto = primeiro % segundo;

        System.out.printf("Resto da divisão: %d\n", resto);
    }
}


















