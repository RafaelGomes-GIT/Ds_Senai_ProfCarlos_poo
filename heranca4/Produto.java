package heranca4;

public abstract class Produto {
    protected String tamanho;
    protected String marca;
    protected String cor;
    protected String preco;
    
    public Produto(String tamanho, String marca, String cor, String preco) {
        this.tamanho = tamanho;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    
    public String toStringCamisa() {
        return "Produto [tamanho=" + tamanho + ", marca=" + marca + ", cor=" + cor + ", preco=" + preco + "]";
    }
    /* 
    public String toStringCamisa() {
        return "Produto [tamanho=" + tamanho + ", marca=" + marca + ", cor=" + cor + ", preco=" + preco + "]";
    }

    public String toStringSapato() {
        return "Produto [tamanho=" + tamanho + ", marca=" + marca + ", cor=" + cor + ", preco=" + preco + "]";
    }
    */


}
