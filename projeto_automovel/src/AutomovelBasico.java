
public class AutomovelBasico extends Automovel {

    private boolean retrovisorPassageiro;
    private boolean limpadorTraseiro;
    private boolean radioFM;

    public AutomovelBasico(String cor, String modelo, String combustivel, boolean retrovisorPassageiro,
            boolean limpadorTraseiro, boolean radioFM) {
        super(cor, modelo, combustivel);
        this.retrovisorPassageiro = retrovisorPassageiro;
        this.limpadorTraseiro = limpadorTraseiro;
        this.radioFM = radioFM;
    }

    public boolean isRetrovisorPassageiro() {
        return retrovisorPassageiro;
    }

    public void setRetrovisorPassageiro(boolean retrovisorPassageiro) {
        this.retrovisorPassageiro = retrovisorPassageiro;
    }

    public boolean isLimpadorTraseiro() {
        return limpadorTraseiro;
    }

    public void setLimpadorTraseiro(boolean limpadorTraseiro) {
        this.limpadorTraseiro = limpadorTraseiro;
    }

    public boolean isRadioFM() {
        return radioFM;
    }

    public void setRadioFM(boolean radioFM) {
        this.radioFM = radioFM;
    }

    @Override
    public double getPreco() {
        double preco = super.getPreco();
        if (retrovisorPassageiro) {
            preco += 100;
        }
        if (limpadorTraseiro) {
            preco += 250;
        }
        if (radioFM) {
            preco += 300;
        }
        return preco;
    }

    @Override
    public String toString() {
        return super.toString() + "\nretrovisorPassageiro: " + retrovisorPassageiro + "\nlimpadorTraseiro: "
                + limpadorTraseiro
                + "\nradioFM: " + radioFM;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (retrovisorPassageiro ? 1231 : 1237);
        result = prime * result + (limpadorTraseiro ? 1231 : 1237);
        result = prime * result + (radioFM ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        AutomovelBasico other = (AutomovelBasico) obj;
        if (retrovisorPassageiro != other.retrovisorPassageiro)
            return false;
        if (limpadorTraseiro != other.limpadorTraseiro)
            return false;
        if (radioFM != other.radioFM)
            return false;
        return true;
    }

}