public class IMC {
    private double altura, peso, imc;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcIMC() {
        imc = peso / (altura * altura);
        return imc;
    }

    public double getImc() {
        return imc;
    }
}
