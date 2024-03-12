public class Funcionario {
    String nome;
    int matricula;
    double deducao, salarioLiquido, salarioBruto;

    public double descontar() {
        deducao = (salarioBruto * 15) / 100;
        return deducao;
    }

    public double salarioLiq() {
        salarioLiquido = salarioBruto - deducao;
        return salarioLiquido;
    }
}