public class Poupanca {

    private float contribuicao;
    private static float jurosMes;
    private float tempoDePoupanca;
    private float valorFuturo;

    public Poupanca(){

        this.valorFuturo = contribuicao * (float)Math.pow((1 + jurosMes), this.tempoDePoupanca);

    }
}
