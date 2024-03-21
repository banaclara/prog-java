public class Carro {

    private String marca, modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }
}
