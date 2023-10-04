
public class Triangulo extends Forma {
    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int centrox, int centroy, String cor, int base, int altura) {
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
        System.out.println("Triangulo desenhado.");
    }

    @Override
    public double perimetro() {
        return base + 5;
    }  
   
}
