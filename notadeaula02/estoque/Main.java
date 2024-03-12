import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        char repetir;

        do {
            System.out.println("Qual é a quantidade atual em estoque?");
            estoque.setQtddAtual(scanner.nextInt());
            System.out.println("Qual é a quantidade máxima em estoque?");
            estoque.setQtddMax(scanner.nextInt());
            System.out.println("Qual é a quantidade mínima em estoque?");
            estoque.setQtddMin(scanner.nextInt());
            estoque.comprar();
            System.out.println("Recomeçar? [S/N]");
            repetir = scanner.next().charAt(0);
            repetir = Character.toUpperCase(repetir);
        } while (repetir == 'S');

        scanner.close();
    }
}
