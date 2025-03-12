public class Capa {
    private String cor;
    private String material;
    private double preco;

    public Capa() {
    }
    public Capa(String cor, String material, double preco) {
        setCor(cor);
        setMaterial(material);
        setPreco(preco);
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
