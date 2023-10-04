
public class Tigre extends Felino {

    public Tigre() {
    }

    public Tigre(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }
    
        @Override
    public void comer() {
       System.out.println("Tigre comeu.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Tigre fez barulho.");
    }
}
