import java.util.Scanner;

public class ATV5 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int quantidadePares = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);

        scanner.close();
    }
}
