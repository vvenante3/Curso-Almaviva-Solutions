package fundProgJava;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Quanto é 2 + 2");

        var result = scanner.nextInt();
        var errado = result != 4;

        System.out.printf("O resultado é 4. Você errou? (%s)", !errado);
        
    }
}
