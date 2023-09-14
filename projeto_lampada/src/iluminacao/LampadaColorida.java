package iluminacao;

public class LampadaColorida extends Lampada {

    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override // não é obrigatorio, mas é util!
    public void mostrar() {
        String texto = cor + ", " + getTensao() + "V, " + getPotencia() + "W, " + ((isAcesa()) ? "Acesa" : "Apagada")
                + ((isQueimada()) ? ", Queimada" : "")
                + ((isQuebrada()) ? ", Quebrada" : "");
        System.out.println(texto);
    }
}
