import java.util.Date;

public class Empregado extends Pessoa {

    private double salario = 0;

    public Empregado(String nome, String cpf, Date dataDeNascimento, double salario) {

        super(nome,cpf,dataDeNascimento);
        this.salario = salario;

    }

    public double getSalario(){

        return salario;
    }

}
