
public class Felino extends Animal {

    public Felino() {
    }

    public Felino(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }
    
    @Override
    public void andar() {
        System.out.println("Felino andou.");
    }
}
