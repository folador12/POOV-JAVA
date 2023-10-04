
public class Gato extends Felino implements BichoEstimacao {

    public Gato() {
    }

    public Gato(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }

    @Override
    public void comer() {
       System.out.println("Gato comeu.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Gato fez barulho.");
    }

    public void brincar() {
        System.out.println("Gato brincou.");
    }

    public void destruirSapato() {
        System.out.println("Gato destruiu sapato.");
    }

    public void deitarNoColo() {
        System.out.println("Gato deitou no colo.");
    }

   

}
