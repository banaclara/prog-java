import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Maca prod = new Maca();
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Quantas maçãs deseja comprar?");
            prod.setQtdd(scanner.nextInt());
            prod.valorFinal();
            System.out.println("\nPróximo cliente? [S/N]");
            repetir = scanner.next().charAt(0);
            repetir = Character.toUpperCase(repetir);
        } while (repetir == 'S');

        scanner.close();
    }
}