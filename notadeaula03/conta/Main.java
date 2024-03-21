import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        int z, x;

        System.out.println("Nome do titular: ");
        String nome = scanner.next();
        
        do {
            System.out.println("Conta corrente - 1 | Conta poupança - 2 | Sair - 3");
            x = scanner.nextInt();

            switch (x) {
                case 1:
                    cc.setTitular(nome);
                    do {
                        System.out.println("1 - Depositar | 2 - Sacar | 3 - Utilizar o cheque especial | 4 - Exibir dados da conta | 5 - Voltar para o menu de contas | 6 - Sair");
                        int y = scanner.nextInt();
                        switch (y) {
                            case 1:
                                System.out.println("Valor a ser depositado:");
                                cc.depositoCorrente(scanner.nextDouble());
                                break;
                            case 2:
                                System.out.println("Valor a ser sacado:");
                                double saque = scanner.nextDouble();
                                if (saque > cc.getSaldo()) {
                                    System.out.println("O valor solicitado não está disponível no seu saldo. Deseja entrar no cheque especial? [S/N]");
                                    char ce = scanner.next().charAt(0);
                                    ce = Character.toUpperCase(ce);
                                    if (ce == 'S') {
                                        cc.usarChequeEspecial(saque);
                                    } else {
                                        z = 0;
                                    }
                                } else {
                                    cc.sacar(saque);
                                }
                                break;
                            case 3:
                                System.out.println("Quanto deseja retirar do cheque especial?\nDisponível: " + cc.getChequeEspecial());
                                cc.usarChequeEspecial(scanner.nextDouble());
                                break;
                            case 4:
                                cc.exibirCC();
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                        if (y == 6) {z = 1; x = 3;} else if (y != 5) {
                            System.out.println("0 - Retornar ao menu");
                            z = scanner.nextInt();
                        } else {break;}
                    } while (z == 0);
                    break;
                case 2:
                    cp.setTitular(nome);
                    do {
                        System.out.println("1 - Depositar | 2 - Sacar | 3 - Calcular rendimento | 4 - Exibir dados da conta | 5 - Voltar para o menu de contas | 6 - Sair");
                        int y = scanner.nextInt();
                        switch (y) {
                            case 1:
                                System.out.println("Valor a ser depositado:");
                                cp.depositar(scanner.nextDouble());
                                break;
                            case 2:
                                System.out.println("Valor a ser sacado:");
                                double saque = scanner.nextDouble();
                                if (saque > cp.getSaldo()) {
                                    System.out.println("Valor indisponível para saque.");
                                } else {cp.sacar(saque);}
                                break;
                            case 3:
                                System.out.println("Taxa Selic: ");
                                cp.calcularRendimento(scanner.nextDouble());
                                break;
                            case 4:
                                cp.exibirCP();
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                        if (y == 6) {z = 1; x = 3;} else if (y != 5) {
                            System.out.println("0 - Retornar ao menu");
                            z = scanner.nextInt();
                        } else {break;}
                    } while (z == 0);
            }
        } while (x != 3);
        scanner.close();
    }
}
