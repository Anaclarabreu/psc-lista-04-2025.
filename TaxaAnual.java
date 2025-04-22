import java.util.Scanner;

public class TaxaAnual {

    public static void main(String[] args) {

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while (paisA <= paisB) {
            paisA *= 1.03;
            paisB *= 1.015;
            anos++;
        }
        System.out.println(
                "Serao necessarios " + anos + "anos para que a populacao do pais A ultrapasse ou iguale a do pais B.");
    }

}