package Ex01;

public class Cliente {
    private String nome;
    private String loja;
    private String produto;
    private float preco;
    private String endereco;

    public Cliente(String nome, String loja, String produto, float preco, String endereco) {
        super();
        this.nome = nome;
        this.loja = loja;
        this.produto = produto;
        this.preco = preco;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void visualizar() {
        System.out.printf("\nCliente: %s\nLoja: %s\nProduto: %s\nPreço: R$%.2f\nEntrega: %s\n", nome, loja, produto, preco, endereco);
    }
}
