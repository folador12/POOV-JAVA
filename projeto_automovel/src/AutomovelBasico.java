public class AutomovelBasico extends Automovel {

    private boolean retrovisorPassageiro;
    private boolean vidroTraseiro;
    private boolean Radio;

    public AutomovelBasico(boolean retrovisorPassageiro, boolean vidroTraseiro, boolean radio) {
        this.retrovisorPassageiro = retrovisorPassageiro;
        this.vidroTraseiro = vidroTraseiro;
        Radio = radio;
    }

    public AutomovelBasico(String modelo, String cor, String combustivel, boolean retrovisorPassageiro,
            boolean vidroTraseiro, boolean radio) {
        super(modelo, cor, combustivel);
        this.retrovisorPassageiro = retrovisorPassageiro;
        this.vidroTraseiro = vidroTraseiro;
        Radio = radio;
    }

    public boolean isRetrovisorPassageiro() {
        return retrovisorPassageiro;
    }

    public void setRetrovisorPassageiro(boolean retrovisorPassageiro) {
        this.retrovisorPassageiro = retrovisorPassageiro;
    }

    public boolean isVidroTraseiro() {
        return vidroTraseiro;
    }

    public void setVidroTraseiro(boolean vidroTraseiro) {
        this.vidroTraseiro = vidroTraseiro;
    }

    public boolean isRadio() {
        return Radio;
    }

    public void setRadio(boolean radio) {
        Radio = radio;
    }

}
