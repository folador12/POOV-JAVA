package poov;

public class Motor {

    private int potencia;
    private int tipoCombustivel;
    private String modelo;

    public Motor() {
        potencia = -1;
        tipoCombustivel = -1;
        modelo = "Sem modelo";
    }

    public Motor(int potencia, int tipoCombustivel, String modelo) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro [potencia=" + potencia + ", tipoCombustivel=" + tipoCombustivel + ", modelo=" + modelo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + potencia;
        result = prime * result + tipoCombustivel;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Motor other = (Motor) obj;
        if (potencia != other.potencia)
            return false;
        if (tipoCombustivel != other.tipoCombustivel)
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        return true;
    }

}
