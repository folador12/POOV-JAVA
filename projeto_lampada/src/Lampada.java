
public class Lampada {

    private int tensao;
    private int potencia;
    private boolean ligada;
    private boolean quebrada;
    private boolean queimada;

    public Lampada() {

    }

    public Lampada(int t, int p) {
        this.tensao = t;
        this.potencia = p;
    }

    public Lampada(int t, int p, boolean l) {
        this.tensao = t;
        this.potencia = p;
        this.ligada = l;
    }

    public void mostrar() {
        String texto = tensao + "V, " + potencia + "W, " + ((ligada) ? "Ligada" : "Desligada")
                + ((queimada) ? " Queimada" : "")
                + ((quebrada) ? " Quebrada" : "");

        System.out.println(texto);
    }

}
