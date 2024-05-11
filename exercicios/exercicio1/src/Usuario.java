import java.util.Scanner;

public class Usuario {

    private String nome;
    private int nascimento;
    private int cpf;
    private String email;
    private String senha;
    private Verificacao verificalogin();

    public void criarConta(){

        Scanner scan = new Scanner(System.in);
        nome = scan.nextLine();
        nascimento = scan.nextInt();
        cpf = scan.nextInt();
        email = scan.next();
        senha = scan.next();

        verificaLogin(nome, nascimento, cpf, email, senha);
    }
}
