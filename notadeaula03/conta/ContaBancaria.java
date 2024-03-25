public class ContaBancaria {
    protected String titular;
    protected double saldo = 0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void exibirDados() {
        System.out.println("--- DADOS DA CONTA ---");
        System.out.println("Titular: " + titular);
        System.out.println("Valor em conta: " + saldo);
    }

}
