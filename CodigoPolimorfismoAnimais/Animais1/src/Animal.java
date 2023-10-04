
public class Animal {

    private String foto;
    private String comida;
    private double fome;
    private double limites[];
    private String local;

    public Animal() {
    }

    public Animal(String foto, String comida, double fome, double[] limites, String local) {
        this.foto = foto;
        this.comida = comida;
        this.fome = fome;
        this.limites = limites;
        this.local = local;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double[] getLimites() {
        return limites;
    }

    public void setLimites(double[] limites) {
        this.limites = limites;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public void fazerBarulho() {
        System.out.println("Animal fez barulho.");
    }
    
    public void comer() {
        System.out.println("Animal comeu.");
    }
    
    public void dormir() {
        System.out.println("Animal dormiu.");
    }
    
    public void andar() {
        System.out.println("Animal andou.");
    }
}
