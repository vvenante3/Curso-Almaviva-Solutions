package estruturaControle;

import java.util.Scanner;

// Estrutura For

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(var cont = 0; cont <= 10 ; cont++){
            if(cont % 2 == 0){
                System.out.printf("%s \n", cont);
            }
        }


    }
}
