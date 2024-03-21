public class Professor extends Pessoa {
    
    double salario;

    public Professor() {}

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
    
    public void exibirProf() {
        System.out.println("-- DADOS DO(A) PROFESSOR(A) --");
        super.exibirDados();
        System.out.println("Salário: " + salario);
    }
}
