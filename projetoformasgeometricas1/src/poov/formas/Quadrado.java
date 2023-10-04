
public class Quadrado extends Forma {

    private int tamLado;

    public Quadrado() {
    }

    public Quadrado(int centrox, int centroy, String cor, int tamLado) {
        super(centrox, centroy, cor);
        this.tamLado = tamLado;
    }

    public int getTamLado() {
        return tamLado;
    }

    public void setTamLado(int tamLado) {
        this.tamLado = tamLado;
    }

    @Override
    public double area() {
        return tamLado * tamLado;
    }

    @Override
    public double perimetro() {
        return tamLado * 4;
    }

    @Override
    public void desenhar() {
        System.out.println("Quadrado desenhado.");
    }

    public void exclusivoQuadrado() {
        System.out.println("faz nada");
    }
}
