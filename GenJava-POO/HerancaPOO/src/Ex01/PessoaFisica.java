package Ex01;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String loja, String produto, float preco, String endereco, String cpf) {
        super(nome, loja, produto, preco, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar(){
        System.out.printf("\nCliente: %s\nLoja: %s\nProduto: %s\nPreço: R$%.2f\nEntrega: %s\nCpf: %s\n", getNome(), getLoja(), getProduto(), getPreco(), getEndereco(), cpf);

    }
}
