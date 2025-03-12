public class Bicicleta {
    private String marca;
    private String modelo;
    private String tipo;
    private Double preco;
    private Acessorio acessorio;

    public Bicicleta() {
    }
    public Bicicleta(String marca, String modelo, String tipo, Double preco, Acessorio acessorio) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setPreco(preco);
        setAcessorio(acessorio);
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return this.preco;
    }
    public void setPreco(Double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido.");
            return;
        }
        this.preco = preco;
    }

    public Acessorio getAcessorio() {
        return this.acessorio;
    }
    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }
}
