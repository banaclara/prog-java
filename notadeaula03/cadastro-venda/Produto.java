public class Produto {

    protected String nome;
    protected int estoque;
    protected double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public double venda(int itens) {
        estoque = estoque - itens;
        return estoque;
    }

    public double valor(int itens) {
        return itens * preco;
    }
}
