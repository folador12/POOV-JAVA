
public class Hipopotamo extends Animal {

    public Hipopotamo() {
    }

    public Hipopotamo(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }
    
        @Override
    public void comer() {
       System.out.println("Hipopotamo comeu.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Hipopotamo fez barulho.");
    }
}
