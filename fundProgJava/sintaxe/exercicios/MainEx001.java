package sintaxe.exercicios;

import java.util.Scanner;

public class MainEx001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o modelo do seu carro?");
        var modeloCarro = scanner.next();

        System.out.println("Qual o ano de seu carro?");
        var anoCarro = scanner.nextInt();


        System.out.printf("O modelo do seu carro é %s, fabricado em %s.", modeloCarro, anoCarro);

    }
}
