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

    public int getQtddAtual() {
        return qtddAtual;
    }

    public int getQtddMedia() {
        qtddMedia = (qtddMax + qtddMin) / 2;
        return qtddMedia;
    }
}