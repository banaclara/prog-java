public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial = 1000;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public void depositar(double valor) {
        if (saldo <= 0 && valor + saldo > 0) {
            chequeEspecial = 1000;
            super.depositar(valor);
        } else if (saldo <= 0) {
            if (saldo + valor > 0) {
                chequeEspecial += (saldo + valor);
            } else {
                chequeEspecial += valor;
            }
            saldo = saldo + valor;
        } else if (valor > saldo && saldo + valor < 0) {
            chequeEspecial += (saldo + valor);
            saldo += valor;
        } else {
            super.depositar(valor);
        }
    }

    public void usarChequeEspecial(double valor) {
        if (valor > chequeEspecial) {
            System.out.println("O valor solicitado não está disponível no cheque especial.");
        } else if (saldo > 0 && saldo - valor < 0) {
            saldo -= valor;
            chequeEspecial += saldo;
        } else if (saldo - valor >= 0) {
            System.out.println("O valor solicitado está disponível no seu saldo e não precisa ser descontado do cheque especial. Retorne ao menu e selecione a opção 'Sacar'.");
        } else {
            saldo -= valor;
            chequeEspecial -= valor;
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disponível no cheque especial: " + chequeEspecial);
        System.out.println("------");
    }
}