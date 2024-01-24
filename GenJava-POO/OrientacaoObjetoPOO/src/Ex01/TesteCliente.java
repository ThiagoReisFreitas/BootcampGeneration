package Ex01;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente[] lista = new Cliente[2];

        lista[0] = new Cliente("Thiago Reis", 23, "Sense SkateShop", "Shape Flip Maple", 299.99);
        lista[1] = new Cliente("Deize Cristina", 52, "FastShop", "Tv Oled 60", 2900.99);

        for(Cliente roda:lista) {
            roda.visualizar();
        }
    }
}
