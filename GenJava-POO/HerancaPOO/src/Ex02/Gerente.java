package Ex02;

public class Gerente extends Funcionario{
    private int supervisaoFuncionarios;

    public Gerente(String nomeFuncionario, int idadeFuncionario, String cargofuncionario, String empresa, float salario, int supervisaoFuncionarios) {
        super(nomeFuncionario, idadeFuncionario, cargofuncionario, empresa, salario);
        this.supervisaoFuncionarios = supervisaoFuncionarios;
    }

    public int getSupervisaoFuncionarios() {
        return supervisaoFuncionarios;
    }

    public void setSupervisaoFuncionarios(int supervisaoFuncionarios) {
        this.supervisaoFuncionarios = supervisaoFuncionarios;
    }

    public void visualizar(){
        System.out.printf("\nFuncionario: %s\nCargo: %s\nIdade: %d\n Sálario: R$%.2f\nEmpresa: %s\nFuncionarios Supervisionados: %d\n", getNomeFuncionario(), getCargofuncionario(), getIdadeFuncionario(), getSalario(), getEmpresa(), supervisaoFuncionarios);
    }
}
