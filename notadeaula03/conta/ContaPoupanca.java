public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public double calcularRendimento(double selic) {
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        return rendimento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("O rendimento mensal da sua conta é de R$ %.2f\n", rendimento);
        System.out.println("------");
    }

    @Override
    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Valor indisponível para saque.");
        } else {
            super.sacar(saque);
        }
    }
}
