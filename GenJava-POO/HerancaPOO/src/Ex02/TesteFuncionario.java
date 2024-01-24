package Ex02;

public class TesteFuncionario {
    public static void main(String[] args){

        Funcionario[] listaFuncionario = new Funcionario[2];
        listaFuncionario[0] = new Funcionario("Thiago Reis", 23, "Desenvolvedor Java", "B3", 5000f);
        listaFuncionario[1] = new Funcionario("Deize Cristina", 53, "Contadora", "Faculdade de Guarulhos", 3000f);
        System.out.println("Objeto Funcionario instanciado: ");
        for(Funcionario f1:listaFuncionario){
            f1.visualizar();
        }

        Gerente[] listaGerentes = new Gerente[2];
        listaGerentes[0] = new Gerente("Orlando", 54, "Gerente Senior", "Ramos Oliveira", 4000f, 5);
        listaGerentes[1] = new Gerente("Olavo", 29, "Gerente Junior", "Cooper-ativa", 3990f, 2);
        System.out.println("Objeto Gerente instanciado: ");
        for(Gerente g1:listaGerentes){
            g1.visualizar();
        }

        Vendedor[] listaVendedor = new Vendedor[2];
        listaVendedor[0] = new Vendedor("Marcio", 39,"Consultor de Vendas Senior", "M&A Metais", 100000f, 200);
        listaVendedor[1] = new Vendedor("Roberio", 70, "Representante Comercial", "Ribeiro & Pavani", 30000f, 40);
        System.out.println("\nObjeto Vendedor instanciado: ");
        for(Vendedor v1:listaVendedor){
            v1.visualizar();
        }
    }
}
