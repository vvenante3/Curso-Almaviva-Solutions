package estruturaControle;

import java.util.Scanner;

// Estrutura Switch-Case

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 3");
        var numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.printf("Ai zé da manga!");
                break;

            case 2:
                System.out.printf("Essas, mais de mesa. Aqui ao lado pederneiras.... Aii Aiiii (choque da uva)");
                break;

            case 3:
                System.out.printf("Irineu, você não sabe nem eu.");
                break;

            default:
                System.out.printf("Número inválido");
                break;
        }
        
    }
}
