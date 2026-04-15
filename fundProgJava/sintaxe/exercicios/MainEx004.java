package sintaxe.exercicios;

import java.util.Scanner;

public class MainEx004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a idade em anos da 1ª pessoa?");
        var idade1 = scanner.nextInt();

        System.out.println("Qual a idade em anos da 2ª pessoa?");
        var idade2 = scanner.nextInt();

        var diferencaIdade = idade1 - idade2;

        


        System.out.printf("A diferença de idade entre a 1ª pessoa da 2ª é de %s anos", diferencaIdade);

    }


}
