import java.util.Date;

public class Main {

    public static void main(String[] args){

        Aluno aluno = new Aluno("Renan", "193.543.121.75", new Date(), 2310);

        aluno.setNome("Renan Aderne Freitas");
        System.out.println("Aluno: " + aluno.getNome() + " Matrícula: " + aluno.getMatricula());

        Empregado empregado = new Empregado("Jonas", "199.324.563.15", new Date(), 2500.00);

        System.out.println("Empregado: " + empregado.getNome() + " Salário: " + empregado.getSalario());
    }
}
