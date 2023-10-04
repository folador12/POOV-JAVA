
public class Cachorro extends Canino {

    public Cachorro() {
    }

    public Cachorro(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }

        @Override
    public void comer() {
       System.out.println("Cachorro comeu.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Cachorro fez barulho.");
    }
}
