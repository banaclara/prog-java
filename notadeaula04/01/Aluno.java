public class Aluno extends Pessoa {

    int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibirAluno() {
        System.out.println("-- DADOS DO(A) ALUNO(A) --");
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }
    
}
