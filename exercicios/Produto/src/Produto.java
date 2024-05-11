public class Produto {
    private String nome;
    private String descricao;
    private final Venda vendaMensal;   //é considerado final, pois é desejado que a referência da instância "venda"
                                // seja algo além da classe "Venda".
    public Produto() { //construtor

        vendaMensal = new Venda();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco(){
        return this.vendaMensal.preco;
    }
    public void setPreco(float preco) {
        this.vendaMensal.preco = preco;
    }

    public int getQuantidade(){
        return this.vendaMensal.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.vendaMensal.quantidade = quantidade;
    }

    public void exibeResumo(){
        System.out.println("RESUMO DE PERFORMANCE DE VENDA:");
        System.out.println("Nome do produto: " + getNome() + ".");
        System.out.println("Descrição do produto: " + getDescricao() + ".");
        System.out.println("Preço cobrado no mês: R$ " + getPreco() + ".");
        System.out.println("Quantidade vendida no mês: " + getQuantidade() + " unidades.");
        System.out.println("Lucro total no mês: R$ " + this.vendaMensal.calculaLucro(getQuantidade(), getPreco()) + ".");
    }

}
