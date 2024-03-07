public class Maca {
    private double preco, desconto;
    private int qtdd;

    public void setQtdd(int qtdd) {
        this.qtdd = qtdd;
    }

    public int getQtdd() {
        return qtdd;
    }
    
    public double getPreco() {
        preco = qtdd * 1.30;
        return preco;
    }

    public double getDesconto() {
        desconto = qtdd * 1.00;
        return desconto;
    }
}