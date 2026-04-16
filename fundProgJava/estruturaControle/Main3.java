package estruturaControle;

import java.util.Scanner;

// Estrutura While / Do-While

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        int numero2 = 5;

        while(numero <= 5){
            System.out.println(numero);
            numero++;
        }

        System.out.println("================");

        do {
            System.out.println(numero2);
            numero2--;
        } while (numero2 >= 1);
       
    }
}
