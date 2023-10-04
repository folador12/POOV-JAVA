
public class Gato extends Animal {

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
}
