public class Produto {
    private String tipo, detalhes;
    private double valor;

    public Produto(String tipo, double valor, String detalhes) {
        this.tipo = tipo;
        this.valor = valor;
        this.detalhes = detalhes;
    }

    public void dados() {
        System.out.println(tipo);
        System.out.println(valor);
        System.out.println(detalhes);
    }
}
