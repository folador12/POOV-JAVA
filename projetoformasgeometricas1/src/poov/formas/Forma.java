
public class Forma {

    private int centrox;
    private int centroy;
    private String cor;

    public Forma() {
    }

    public Forma(int centrox, int centroy, String cor) {
        this.centrox = centrox;
        this.centroy = centroy;
        this.cor = cor;
    }

    public int getCentrox() {
        return centrox;
    }

    public void setCentrox(int centrox) {
        this.centrox = centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public void setCentroy(int centroy) {
        this.centroy = centroy;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double area() {
        return 0.0;
    }

    public double perimetro() {
        return 0.0;
    }

    public void desenhar() {
        System.out.println("Forma desenhada.");
    }

}
