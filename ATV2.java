import java.util.Scanner;

public class ATV2 {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Valores digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
