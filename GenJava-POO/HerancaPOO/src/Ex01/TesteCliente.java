package Ex01;

public class TesteCliente {
    public static void main(String[] args){
        Cliente[] listaCliente = new Cliente[2];

        listaCliente[0] = new Cliente("Thiago Reis","Lojas Americanas", "Fone de Ouvido", 99.99f, "Rua Maria de Castro Mesquita");
        listaCliente[1] = new Cliente("Deize Cristina dos Reis", "Madeira Madeira", "Conjunto de Cadeiras", 289.98f, "Rua Maria de Castro Mesquita");
        System.out.println("Objeto Cliente instanciado:");
        for(Cliente laco:listaCliente){
            laco.visualizar();
        }

        PessoaFisica[] listaPessoaFisica = new PessoaFisica[2];
        listaPessoaFisica[0] = new PessoaFisica("Roberto Carlos", "Loja de Musica do Seu Zé", "Microfone", 12000.0f, "Barra da Tijuca", "123456123-04");
        listaPessoaFisica[1] = new PessoaFisica("Marcelo Resende", "Farmacia Boa Vista", "Pastilha Mentolada", 3.99f, "Rua do Curupira Alado", "6785747689-03");
        System.out.println("\nObjeto Pessoa Fisica instanciado: ");
        for(PessoaFisica i:listaPessoaFisica){
            i.visualizar();
        }

        PessoaJuridica[] listaPessoaJuridica = new PessoaJuridica[2];
        listaPessoaJuridica[0] = new PessoaJuridica("Mario Covas", "Papelaria Drummond", "Caneta Tinteiro", 937.26f, "Rua Bela Vista", "98345326/9832-98");
        listaPessoaJuridica[1] = new PessoaJuridica("Osama Bin Laden", "SoGamers", "Mario 64", 2423f,"Afeganistão do Norte", "137983423/2342-09");
        System.out.println("\nObjeto Pessoa Juridica instanciado: ");
        for(PessoaJuridica d:listaPessoaJuridica){
            d.visualizar();
        }
    }
}
