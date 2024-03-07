public class DescontoINSS {
    double deducao, salarioLiquido, salarioBruto;

    public double descontar() {
        deducao = (salarioBruto * 15) / 100;
        return deducao;
    }

    public double salarioDescontado() {
        salarioLiquido = salarioBruto - deducao;
        return salarioLiquido;
    }
}
