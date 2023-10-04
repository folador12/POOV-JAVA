
public class Retangulo extends Forma {
    private int base;
    private int altura;

    public Retangulo() {
    }

    public Retangulo(int centrox, int centroy, String cor, int base, int altura) {
        super(centrox, centroy, cor);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Retangulo desenhado.");
    }

    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }
    
    
}
