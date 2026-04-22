package fundProgJava.pooJava.exercicio2;

public class Main {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setSalario(4000.0);
        gerente.setDepartamento("Vendas");

        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome("Rodrigo");
        desenvolvedor.setSalario(8000.0);
        desenvolvedor.setFuncao("Front-End");
        
        System.out.println("=== GERENTE ===");
        System.out.println("Nome: " + gerente.getNome());        
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());

        System.out.println("=== DESENVOLVEDOR ===");
        System.out.println("Nome: " + desenvolvedor.getNome());      
        System.out.println("Salario: " + desenvolvedor.getSalario());        
        System.out.println("Função: " + desenvolvedor.getFuncao());

    }
}
