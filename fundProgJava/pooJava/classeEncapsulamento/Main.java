package pooJava.classeEncapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           
        var pessoa = new Pessoa();

        pessoa.setNome("Vitor");
        pessoa.setIdade(27);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
    }
}
