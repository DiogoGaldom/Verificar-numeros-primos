import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroPrimo;
        int numeroDivisores = 0;

        System.out.println("Digite um numero ");
        numeroPrimo = input.nextInt();

        for (int i = 1; i <= numeroPrimo; i++) {
            if (numeroPrimo % i == 0) {
                numeroDivisores++;

            }
        }

        if (numeroDivisores == 2) {
            System.out.println("O numero é primo ");

        } else {
            System.out.println("o numero não é primo ");

        }

    }
}