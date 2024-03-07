public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double media;

    public double media() {
        media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public void status() {
        if (media >= 70) {
            System.out.println(nome + " está aprovado(a). Média " + media);
        } else if (media < 40) {
            System.out.println(nome + " está reprovado(a). Média: " + media);
        } else {
            System.out.println(nome + " está na final. Média: " + media);
        }
    }
}
