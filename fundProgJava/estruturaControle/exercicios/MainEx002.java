import java.util.Scanner;

public class MainEx002 {

// Cálculo de IMC
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura em metros");
        var altura = scanner.nextInt();
        var alturaMetros = altura / 100.0;
        System.out.println("Informe seu peso em kg");
        var peso = scanner.nextFloat();

        var imc = peso / (alturaMetros * alturaMetros);

        System.out.printf("Seu IMC é %.2f\n", imc);

        if(imc <= 18.5){
            System.out.printf("Abaixo do peso");
        } else if ( imc <= 24.9){
            System.out.printf("PESO IDEAL");
        } else if ( imc <= 25){
            System.out.printf("Levemente acima do peso");
        } else if ( imc <= 30){
            System.out.printf("Obesidade Grau I");
        } else if ( imc <= 35){
            System.out.println("Obsidade Grau II (Severa)");
        } else if ( imc <= 40){
            System.out.printf("Obesidade Nível Lona de Circo (vai explodir!)");
        }

    }
}
