
public abstract class Canino extends Animal {

    public Canino() {
    }

    public Canino(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }

    @Override
    public void andar() {
        System.out.println("Canino andou.");
    }
    
   
}
