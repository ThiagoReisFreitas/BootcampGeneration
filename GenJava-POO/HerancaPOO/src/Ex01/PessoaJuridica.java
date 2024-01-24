package Ex01;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, String loja, String produto, float preco, String endereco, String cnpj) {
        super(nome, loja, produto, preco, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar(){
        System.out.printf("\nCliente: %s\nLoja: %s\nProduto: %s\nPreço: R$%.2f\nEntrega: %s\nCnpj: %s\n", getNome(), getLoja(), getProduto(), getPreco(), getEndereco(), cnpj);

    }
}
