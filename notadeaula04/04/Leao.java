public class Leao extends Animal {
    private String pelo;
    
    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }
    
    public void exibirInformacoes() {
        super.exibirInfo();
        System.out.println("Característica " + pelo);
    }
}