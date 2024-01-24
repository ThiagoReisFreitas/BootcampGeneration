package Ex02;

public class Vendedor extends Funcionario{
    private int vendasMes;

    public Vendedor(String nomeFuncionario, int idadeFuncionario, String cargofuncionario, String empresa, float salario, int vendasMes) {
        super(nomeFuncionario, idadeFuncionario, cargofuncionario, empresa, salario);
        this.vendasMes = vendasMes;
    }

    public int getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(int vendasMes) {
        this.vendasMes = vendasMes;
    }

    public void visualizar(){
        System.out.printf("\nFuncionario: %s\nCargo: %s\nIdade: %d\n Sálario: R$%.2f\nEmpresa: %s\nVendas no Mês: %d\n", getNomeFuncionario(), getCargofuncionario(), getIdadeFuncionario(), getSalario(), getEmpresa(), vendasMes);
    }}
