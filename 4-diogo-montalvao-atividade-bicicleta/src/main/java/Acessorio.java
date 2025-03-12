public class Acessorio {
    private String tipo;
    private String marca;
    private String material;
    private Double preco;

    public Acessorio() {
    }
    public Acessorio(String tipo, String marca, String material, Double preco) {
        setTipo(tipo);
        setMarca(marca);
        setMaterial(material);
        setPreco(preco);
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
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
}
