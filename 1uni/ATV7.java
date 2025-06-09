import java.util.Scanner;

public class ATV7 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nValores no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        int maior = vetor[0];
        int posicao = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição em que ele se encontra: " + posicao);

        scanner.close();
    }
}
