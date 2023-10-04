
public class Cachorro extends Canino implements BichoEstimacao {

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

     public void brincar() {
        System.out.println("Cachorro brincou.");
    }

    public void destruirSapato() {
        System.out.println("Cachorro destruiu sapato.");
    }

    public void deitarNoColo() {
        System.out.println("Cachorro deitou no colo.");
    }
   
}
