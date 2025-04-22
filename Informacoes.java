import java.util.Scanner;

public class Informacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.print("Nome (mais de 3 letras): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Idade (0 a 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.print("Sexo (f/m): ");
            sexo = scanner.next().toLowerCase().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Estado Civil (s/c/v/d): ");
            estadoCivil = scanner.next().toLowerCase().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Cadastro validado com sucesso.");
    }
}