package sintaxe;
import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // condicionais || e &&

        System.out.println("Qual a sua idade?");
        var idade = scanner.nextInt();

        System.out.println("Possui CNH?");
        var cnh = scanner.nextBoolean();

        var podeDirigir = idade >= 18;
        var resultado1 = idade >=18 || podeDirigir;

        var contemCnh = cnh == true;
        
        var Resultado2 = resultado1 && contemCnh;

        System.out.printf("O resultado é (%s)", Resultado2);

    }
}
