public class Arara extends Animal {
    protected int qtdeOvos;
    
    public Arara() {}

    public Arara(String classe, String locomocao, int qtdeOvos) {
        super(classe, locomocao);
        this.qtdeOvos = qtdeOvos;
    }

    public int getQtdeOvos() {
        return qtdeOvos;
    }

    public void setQtdeOvos(int qtdeOvos) {
        this.qtdeOvos = qtdeOvos;
    }
}
