public class Main {

    public static void main(String[] args){

        Conta contaRenan = new Conta();

        contaRenan.depositaSaldo(1500);
        contaRenan.setNome("Renan Aderne Freitas");
        String nome = contaRenan.getNome();
        System.out.println(nome);
        double saldo = contaRenan.getSaldo();
        System.out.println(saldo);

    }
}
