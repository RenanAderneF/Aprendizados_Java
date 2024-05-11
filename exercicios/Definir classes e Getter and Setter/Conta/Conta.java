public class Conta {

        private double saldo = 0;
        private String nome;

        public void depositaSaldo(double valor){ //deposita valor + 10% do mesmo
                this.saldo =+ valor + (valor *  0.10);
        }
        public double getSaldo(){
                return saldo;
        }

        public void setNome(String N){
                this.nome = N;
        }

        public String getNome(){
                return this.nome;
        }
}
