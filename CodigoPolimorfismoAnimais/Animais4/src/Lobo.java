
public class Lobo extends Canino {

    public Lobo() {
    }

    public Lobo(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }

        @Override
    public void comer() {
       System.out.println("Lobo comeu.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Lobo fez barulho.");
    }
}
