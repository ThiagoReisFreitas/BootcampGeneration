package Ex02;

public class Funcionario {
    private String nomeFuncionario;
    private int idadeFuncionario;
    private String cargoFuncionario;
    private String empresa;
    private float salario;

    public Funcionario(String nomeFuncionario, int idadeFuncionario, String cargofuncionario, String empresa,
                       float salario) {
        super();
        this.nomeFuncionario = nomeFuncionario;
        this.idadeFuncionario = idadeFuncionario;
        this.cargoFuncionario = cargofuncionario;
        this.empresa = empresa;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public String getCargofuncionario() {
        return cargoFuncionario;
    }

    public void setCargofuncionario(String cargofuncionario) {
        this.cargoFuncionario = cargofuncionario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void visualizar() {
        System.out.printf("\nFuncionario: %s\nCargo: %s\nIdade: %d\n Sálario: R$%.2f\nEmpresa: %s\n", nomeFuncionario, cargoFuncionario, idadeFuncionario, salario, empresa);
    }

}
