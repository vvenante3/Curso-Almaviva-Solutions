package fundProgJava.exercicios;

import java.util.Scanner;

public class MainEx003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cálculo da Área do Triângulo ---");

        System.out.println("Qual a base do triângulo em cm?");
        var base = scanner.nextInt();

        System.out.println("Qual a altura do triângulo em cm?");
        var altura = scanner.nextInt();

        var areaTriangulo = (base * altura) / 2;

        System.out.printf("A área do triângulo é de %s", areaTriangulo);

    }
}
