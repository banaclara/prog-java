public class Aluno extends Pessoa {
    private int matricula;
    private double nota1, nota2, media;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcmedia() {
        media = (nota1 + nota2) / 2;
        return media;
    }

    public double getMedia() {
        return media;
    }
}