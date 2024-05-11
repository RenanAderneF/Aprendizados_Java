public class Main {

    public static void main(String[] args) {

        Produto barco = new Produto();

        barco.setNome("Barco");
        barco.setDescricao("Barco de pescaria");
        barco.setPreco(1499.99F); //Preço durante o mês
        barco.setQuantidade(25); //Vendas no mês
        barco.exibeResumo();

    }
}
