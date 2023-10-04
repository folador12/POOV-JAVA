
public class Leao extends Animal {

    public Leao() {
    }

    public Leao(String foto, String comida, double fome, double[] limites, String local) {
        super(foto, comida, fome, limites, local);
    }

    @Override
    public void comer() {
       System.out.println("Leao comeu.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Leao fez barulho.");
    }

    
}
