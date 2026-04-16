import java.util.Scanner;

// Tabuada de um número

public class MainEx001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número para realizarmos a tabuada: ");
        var num = scanner.nextInt();

        
        System.out.printf("<===== TABUADA DO %s =====> \n", num);

        for(var cont = 1; cont <= 10; cont++){
            var tabuada = num * cont;

            System.out.printf("%s X %s = %s \n", num, cont, tabuada);
        }
    }
}
