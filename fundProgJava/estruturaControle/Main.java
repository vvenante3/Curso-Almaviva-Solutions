package estruturaControle;

import java.util.Scanner;

// Estrutura If-Else / else-if

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        var nome = scanner.next();
        System.out.println("Informe sua idade:");
        var idade = scanner.nextInt();

        boolean carteira = false;

        if(idade >= 18){
            System.out.println("Você já tirou sua carteira de motorista? (s/n)");
            carteira = scanner.next().equalsIgnoreCase("s");        //tanto faz digitar minúsculo ou maiúsculo
        }

        if(idade < 18){
            System.out.printf("Você possui %s anos, não será possível dirigir.", idade);
        } else if (idade >= 18 && !carteira){
            System.out.printf("%s você posssui %s anos, porém ainda não tem carteira. Não será possível dirigir!", nome, idade);
        } else {
            System.out.printf("%s você tem idade e possui carteira. Poderá dirigir VRUUMM!", nome);
        }

        



    }
}
