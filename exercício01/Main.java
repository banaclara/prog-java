import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IMC imc = new IMC();

        System.out.println("Digite seu peso: ");
        imc.setPeso(scanner.nextDouble());
        System.out.println("Digite sua altura: ");
        imc.setAltura(scanner.nextDouble());

        imc.calcIMC();
        System.out.printf("IMC: %.2f", imc.getImc());

        scanner.close();
    }
}