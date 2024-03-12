public class Estoque {
    private int qtddMax, qtddMin, qtddAtual, qtddMedia;


    public void setQtddAtual(int qtddAtual) {
        this.qtddAtual = qtddAtual;
    }

    public void setQtddMax(int qtddMax) {
        this.qtddMax = qtddMax;
    }

    public void setQtddMin(int qtddMin) {
        this.qtddMin = qtddMin;
    }

    public int getQtddMedia() {
        qtddMedia = (qtddMax + qtddMin) / 2;
        return qtddMedia;
    }

    public void comprar() {
        if (qtddAtual >= getQtddMedia()) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}