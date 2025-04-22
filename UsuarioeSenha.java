import java.util.Scanner;

public class UsuarioeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;
        do {
            System.out.print("Digite o nome de usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro: A senha nao pode ser igual ao nome de usuario.");
            }
        } while (usuario.equals(senha));
        System.out.println("Usuario e senha cadastrados com sucesso.");
    }
}
