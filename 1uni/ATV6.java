import java.util.Scanner;

public class ATV6 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
