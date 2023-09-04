import java.security.InvalidParameterException;

public class Lampada {

    private int tensao; // 110, 220
    private int potencia;
    private boolean acesa;
    private boolean quebrada;
    private boolean queimada;

    // Construtor é um inicializador para as classes
    // Construtor Padrao
    public Lampada() {
        System.out.println("Construtor padrao da Lampada executado");
        tensao = 220;
        potencia = 100;
        // acesa = false;
    }

    // Construtor de Inicializacao 1
    public Lampada(int tensao, int potencia) {
        setTensao(tensao);
        setPotencia(potencia);
    }

    // Construtor de Inicializacao 2
    public Lampada(int tensao, int potencia, boolean acesa) {
        setTensao(tensao);
        setPotencia(potencia);
        this.acesa = acesa; // setAcesa(acesa);
    }

    // Metodo para alterar o valor de uma variavel privada
    public void setTensao(int tensao) {
        if ((tensao == 110) || (tensao == 220)) {
            this.tensao = tensao;
        } else {
            this.tensao = 220;
            throw new InvalidParameterException("Valor inválido de tensao");
        }
    }

    // Metodo para mostrar o valor de uma variavel privada
    public int getTensao() {
        return tensao;
    }

    public void setPotencia(int potencia) {
        if ((potencia == 60) || (potencia == 100) || (potencia == 150)) {
            this.potencia = potencia;
        } else {
            this.potencia = 60;
            throw new InvalidParameterException("Valor inválido de potencia");
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setAcesa(boolean acesa) {
        if (!queimada && !quebrada) {
            this.acesa = acesa;
        } else {
            if (quebrada && acesa) {
                queimada = true;
            }
            this.acesa = false;
        }
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setQuebrada(boolean quebrada) {
        if (quebrada && acesa) {
            queimada = true;
            acesa = false;
        }
        this.quebrada = quebrada;
    }

    public boolean isQuebrada() {
        return quebrada;
    }

    public void setQueimada(boolean queimada) {
        if (queimada && acesa) {
            acesa = false;
        }
        this.queimada = queimada;
    }

    public boolean isQueimada() {
        return queimada;
    }

    public void acender() {
        setAcesa(true);
    }

    public void apagar() {
        setAcesa(false);
    }

    public void quebrar() {
        setQuebrada(true);
    }

    public void queimar() {
        setQueimada(true);
    }

    public void mostrar() {
        String texto = tensao + "V, " + potencia + "W, " + ((acesa) ? "Acesa" : "Apagada")
                + ((queimada) ? ", Queimada" : "")
                + ((quebrada) ? ", Quebrada" : "");
        System.out.println(texto);
    }

}
