import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Diretor dir = new Diretor();

        System.out.println("Nome do(a) gerente: ");
        gerente.setNome(scanner.next());
        gerente.setSalario(4000);
        System.out.println("Departamento: ");
        gerente.setDepartamento(scanner.next());

        System.out.println("Nome do(a) diretor(a):");
        dir.setNome(scanner.next());
        dir.setSalario(7000);
        dir.setAcoes(20);

        System.out.println("-- DADOS GERÊNCIA --");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("Salário (com bonificação): " + gerente.calcularBonus(gerente.getSalario()));
        System.out.println("-- DADOS DIREÇÃO --");
        System.out.println("Nome: " + dir.getNome());
        System.out.println("Ações: " + dir.getAcoes());
        System.out.println("Salário: " + dir.getSalario());

        scanner.close();
    }
}