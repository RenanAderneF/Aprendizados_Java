import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private long matricula, cpf, numCelular;
    private static int contadorAlunos;
    private static final ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public Aluno(String nome, long matricula, long cpf, long numCelular){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.numCelular = numCelular;
        contadorAlunos++;
    }

    public static void registraAluno(){

        Aluno aluno =  new Aluno("",0,0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("REGISTRE UM ALUNO ");
        System.out.print("Nome completo: ");
        aluno.nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        aluno.matricula = Long.parseLong(scanner.nextLine());
        System.out.print("CPF: ");
        aluno.cpf = Long.parseLong(scanner.nextLine());
        System.out.print("N° de celular: ");
        aluno.numCelular = Long.parseLong(scanner.nextLine());
        listaAlunos.add(aluno);

        System.out.println("Registrar outro aluno? Sim[S] Não[N]");
        String resposta = scanner.nextLine();

        if(Objects.equals(resposta, "S")) {

            registraAluno();
        }
    }

    public static void exibeAlunos(){

        for (Aluno aluno: listaAlunos) { //int i = 0; i < listaAlunos.size(); i++)

            System.out.println(aluno.nome);
            System.out.println(aluno.matricula);
            System.out.println(aluno.cpf);
            System.out.println(aluno.numCelular);
        }
    }

}
