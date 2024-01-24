package Ex02;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Thiago Reis", 23, "Desenvolvedor Java", "B3", 5000f);
        Funcionario f2 = new Funcionario("Deize Cristina", 53, "Contadora", "Faculdade de Guarulhos", 3000f);
        f1.visualizacao();
        f2.visualizacao();
    }
}
