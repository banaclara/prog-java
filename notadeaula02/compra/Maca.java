public class Maca {
    private double preco, desconto;
    private int qtdd;

    public void setQtdd(int qtdd) {
        this.qtdd = qtdd;
    }
    
    public double getPreco() {
        preco = qtdd * 1.30;
        return preco;
    }

    public double getDesconto() {
        desconto = qtdd * 1.00;
        return desconto;
    }

    public void valorFinal() {
        if (qtdd >= 12) {
            System.out.printf("O valor da compra é R$ %.2f", getDesconto());
        } else {
            System.out.printf("O valor da compra é R$ %.2f", getPreco());
        }
    }
}