import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Scanner teclado = new Scanner(System.in);
        DescontoINSS dI = new DescontoINSS();

        System.out.println("Nome: ");
        f.nome = teclado.next();
        System.out.println("Matrícula: ");
        f.matricula = teclado.nextInt();
        System.out.println("Salário bruto: ");
        dI.salarioBruto = teclado.nextDouble();
        dI.descontar();

        System.out.print("Salário líquido: " + dI.salarioDescontado());
    }
}
