import java.security.InvalidParameterException;

public class Tv {

    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligada;
    private String resolucao;
    private boolean smart;

    // Construtor Padrão
    public Tv() {
        tamanho = 26;
        canal = 3;
        volume = 50;
        resolucao = "1366 x 768";
    }

    // Construtor Inicialização
    public Tv(int tamanho, int canal, int volume, String resolucao) {
        setTamanho(tamanho);
        setCanal(canal);
        setVolume(volume);
        this.resolucao = resolucao;
    }

    public void setTamanho(int tamanho) {
        if (tamanho > 25 && tamanho < 86) {
            this.tamanho = tamanho;
        } else {
            throw new InvalidParameterException("Valor inválido de tamanho");
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setCanal(int canal) {
        if (canal > 0) {
            this.canal = canal;
        } else {
            throw new InvalidParameterException("Valor inválido de canal");
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            throw new InvalidParameterException("Valor inválido de volume");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setResolucao(String resolução) {
        this.resolucao = resolução;
    }

    public String getResolucao() {
        return this.resolucao;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public boolean isSmart() {
        return smart;
    }

    public void mostrar() {
        String texto = tamanho + " polegadas, " + canal + " CH, " + volume + ", " + resolucao + ", "
                + ((ligada) ? "ligada" : "Desligada") + ((smart) ? ", Smart" : "");
        System.out.println(texto);
    }

}
