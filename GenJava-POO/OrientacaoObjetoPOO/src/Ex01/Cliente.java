package Ex01;

public class Cliente {
    private String nomeCliente;
    private int idadeCliente;
    private String nomeLoja;
    private String nomeProduto;
    private double precoProduto;

    public Cliente(String nomeCliente, int idadeCliente, String nomeLoja, String nomeProduto, double precoProduto) {
        super();
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.nomeLoja = nomeLoja;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void visualizar() {
        System.out.printf("\nCliente: %s\nIdade: %d\nLoja: %s\nProduto: %s\nPreço: R$%.2f\n",nomeCliente, idadeCliente, nomeLoja, nomeProduto, precoProduto);
    }
}
