import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome: ");
        f.nome = teclado.next();
        System.out.println("Matrícula: ");
        f.matricula = teclado.nextInt();
        System.out.println("Salário bruto: ");
        f.salarioBruto = teclado.nextDouble();
        f.descontar();

        System.out.print("Salário líquido: " + f.salarioLiq());

        teclado.close();
    }
}
