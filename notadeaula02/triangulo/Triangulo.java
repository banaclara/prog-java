public class Triangulo {
    private double l1, l2, l3;
    
    public void setL1(double l1) {
        this.l1 = l1;
    }
    
    public void setL2(double l2) {
        this.l2 = l2;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }


    public boolean formarTriangulo() {
        return l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1;
    }

    public void tipoTriangulo() {
        if (l1 == l2 && l1 == l3) {
            System.out.println("Triângulo equilátero.");
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }
    }

}
