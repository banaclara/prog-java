import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        int repetir, n1, n2;

        do {
            System.out.println("Para soma, digite 1; Para subtração, digite 2; Para multiplicação, digite 3; Para divisão, digite 4.");
            int x = teclado.nextInt();

            System.out.println("Primeiro número: ");
            n1 = teclado.nextInt();
            System.out.println("Segundo número: ");
            n2 = teclado.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Resultado da soma: " + c.somar(n1, n2));
                    break;
                case 2:
                    System.out.print("Resultado da subtração: " + c.subtrair(n1, n2));
                    break;
                case 3:
                    System.out.print("Resultado da multiplicação: " + c.multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.printf("Resultado da divisão: %.2f", c.dividir(n1, n2));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("\nPara realizar outra operação, digite 0.");
            repetir = teclado.nextInt();
        } while (repetir == 0);
    }
}
