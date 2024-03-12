import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetir;

        Aluno a = new Aluno();
        Professor prof = new Professor();
        Coordenador coord = new Coordenador();

        do {
            System.out.println("Para cadastrar um aluno, digite 1; Para cadastrar um professor, digite 2; Para cadastrar coordenador, digite 3.");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Nome do aluno:");
                    a.setNome(scanner.next());
                    System.out.println("Matrícula:");
                    a.setMatricula(scanner.nextInt());
                    System.out.println("Primeira nota:");
                    a.setNota1(scanner.nextDouble());
                    System.out.println("Segunda nota:");
                    a.setNota2(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Nome do professor:");
                    prof.setNome(scanner.next());
                    System.out.println("Qual a disciplina ministrada?");
                    prof.setDisciplina(scanner.next());
                    break;
                case 3:
                    System.out.println("Nome do coordenador:");
                    coord.setNome(scanner.next());
                    System.out.println("Qual o curso?");
                    coord.setCurso(scanner.next());
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Para repetir, digite 0");
            repetir = scanner.nextInt();
        } while (repetir == 0);

        scanner.close();
    }
}