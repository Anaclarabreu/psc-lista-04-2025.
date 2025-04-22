import java.util.Scanner;

public class TaxaCrescimento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            int popA, popB;
            double taxaA, taxaB;

            do {
                System.out.print("Populacao do pais A: ");
                popA = scanner.nextInt();
            } while (popA <= 0);

            do {
                System.out.print("Populacao do pais B: ");
                popB = scanner.nextInt();
            } while (popB <= 0 || popB <= popA);

            do {
                System.out.print("Taxa de crescimento do país A (%): ");
                taxaA = scanner.nextDouble();
            } while (taxaA <= 0);

            do {
                System.out.print("Taxa de crescimento do país B (%): ");
                taxaB = scanner.nextDouble();
            } while (taxaB <= 0);

            int anos = 0;
            while (popA <= popB) {
                popA *= 1 + (taxaA / 100);
                popB *= 1 + (taxaB / 100);
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos.");

            System.out.print("Deseja repetir a operação? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);
        } while (repetir == 's');
    }
}
