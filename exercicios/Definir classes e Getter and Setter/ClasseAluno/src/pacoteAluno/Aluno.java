package pacoteAluno;
public class Aluno {

    private String nome;
    private String nascimento;
    private String curso;
    public void saudacao() {

        System.out.println("Olá, meu nome é " + nome);
    }

    public void setNascimento() {
        this.nascimento = nascimento;
    }
    public void getNascimento() {

        System.out.println(nascimento);
    }

}

