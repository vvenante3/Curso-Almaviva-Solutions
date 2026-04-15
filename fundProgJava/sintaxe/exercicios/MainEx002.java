package sintaxe.exercicios;

import java.util.Scanner;

public class MainEx002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Descobrindo a área de um Quadrado ---");
        System.out.println("Qual a medida do lado do quadrado em metros ?");
        var ladoQuadrado = scanner.nextInt();

        var areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.printf("O quadrado possui %sm²", areaQuadrado);

    }
}
