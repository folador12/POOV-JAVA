
public class Circulo extends Forma {

    private int raio;

    public Circulo() {
    }

    public Circulo(int centrox, int centroy, String cor, int raio) {
        super(centrox, centroy, cor);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.1415 * raio * raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Circulo desenhado.");
    }

    @Override
    public double perimetro() {
        return 2 * 3.1415 * raio;
    }

}
