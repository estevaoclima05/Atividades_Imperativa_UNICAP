import java.util.Scanner;

public class ATV3 {
    public static void main(String[] args) {
        double[] numeros = new double[10];      
        double[] quadrados = new double[10];  
        Scanner scanner = new Scanner(System.in);
   
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
            quadrados[i] = numeros[i] * numeros[i];
        }
        
        System.out.println("\nValor original   |   Quadrado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%14.2f   |   %8.2f\n", numeros[i], quadrados[i]);
        }

        scanner.close();
    }
}
