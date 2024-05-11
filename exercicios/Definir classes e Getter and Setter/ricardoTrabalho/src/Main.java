import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Aluno ricardo = new Aluno();

        ricardo.setNome("Ricardo");
        String nome = ricardo.getNome();
        System.out.println(nome);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Seu cpf é " + cpf);

        ricardo.setNascimento("30/11/2000");
        String nascimento = ricardo.getNascimento();
        System.out.println(nascimento);
    }
}
