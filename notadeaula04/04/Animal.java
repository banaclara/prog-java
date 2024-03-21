public class Animal {
    protected String classe, locomocao;

    public Animal() {}
    
    public Animal(String classe, String locomocao) {
        this.classe = classe;
        this.locomocao = locomocao;
    }

    public void exibirInfo() {
        System.out.println("Classe: " + classe);
        System.out.println("Meio de locomoção: " + locomocao);
    }

    public String getClasse() {
        return classe;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }
}
