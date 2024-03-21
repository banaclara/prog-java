public class Gerente extends Funcionario {

    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double calcularBonus(double salario) {
        double bonus = salario * 0.1;
        salario += bonus;
        return salario;
    }
}
