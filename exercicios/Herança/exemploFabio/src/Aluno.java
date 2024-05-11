import java.util.Date;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, String cpf, Date dataDeNascimento, int matricula){

        super(nome, cpf, dataDeNascimento);
        this.matricula = matricula;
    }

    public int getMatricula(){

        return matricula;
    }
}

