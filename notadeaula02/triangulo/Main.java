import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo tri = new Triangulo();
        char repetir;

        do {
            System.out.println("Qual o comprimento do primeiro lado do triângulo?");
            tri.setL1(scanner.nextDouble());
            System.out.println("Qual o comprimento do segundo lado do triângulo?");
            tri.setL2(scanner.nextDouble());
            System.out.println("Qual o comprimento do terceiro lado do triângulo?");
            tri.setL3(scanner.nextDouble());

            if (tri.formarTriangulo()) {
                tri.tipoTriangulo();
            } else {
                System.out.println("Os comprimentos fornecidos não podem formar um triângulo.");
            }

            System.out.println("Novo triângulo? [S/N]");
            repetir = scanner.next().charAt(0);
            repetir = Character.toUpperCase(repetir);
        } while (repetir == 'S');

        scanner.close();
    }
}