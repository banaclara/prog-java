import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Primeira nota: ");
        aluno.nota1 = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        aluno.nota2 = scanner.nextDouble();
        System.out.println("Terceira nota: ");
        aluno.nota3 = scanner.nextDouble();

        aluno.media();
        aluno.status();
    }
}
