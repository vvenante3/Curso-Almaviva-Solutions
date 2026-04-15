package fundProgJava;
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        var idade = scanner.nextInt();

        var podeDirigir = idade > 18;

        System.out.printf("Você pode dirigir? (%s)", podeDirigir);


    }
}
