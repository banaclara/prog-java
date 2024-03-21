import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Televisao tv = new Televisao();
        Smartphone cel = new Smartphone();
        int itens;
        char z;

        System.out.println("Cadastrar Smartphone - 1 / Cadastrar TV - 2");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("Nome:");
                cel.setNome(scanner.next());
                System.out.println("Quantidade em estoque:");
                cel.setEstoque(scanner.nextInt());
                System.out.println("Preço:");
                cel.setPreco(scanner.nextDouble());
                break;
            case 2:
                System.out.println("Nome:");
                tv.setNome(scanner.next());
                System.out.println("Quantidade em estoque:");
                tv.setEstoque(scanner.nextInt());
                System.out.println("Preço:");
                tv.setPreco(scanner.nextDouble());
        }

        System.out.println("Comprar Smartphone - 1 / Comprar TV - 2");
        int y = scanner.nextInt();

        do {
            switch (y) {
                case 1:
                    System.out.println("Quantos smartphones deseja comprar?");
                    itens = scanner.nextInt();
                    cel.venda(itens);
                    System.out.println("O valor da sua compra é R$" + cel.valor(itens));
                    break;
                case 2:
                    System.out.println("Quantas TVs deseja comprar?");
                    itens = scanner.nextInt();
                    tv.venda(itens);
                    System.out.println("O valor da sua compra é R$" + tv.valor(itens));
            }
            System.out.println("Deseja realizar uma nova compra? [S/N]");
            z = scanner.next().charAt(0);
            z = Character.toUpperCase(z);
        } while (z == 'S');

        scanner.close();
    }
}

