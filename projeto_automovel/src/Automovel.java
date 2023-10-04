
public class Automovel {

    private String cor;
    private String modelo;
    private String combustivel; // Gasolina GASOLINA gasolina GAS

    public Automovel() {
        cor = "sem cor";
        modelo = "sem modelo";
        combustivel = "sem combustivel";
    }

    public Automovel(String cor, String modelo, String combustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getPreco() {
        switch (combustivel) {
            case "gasolina":
                return 20000;
            case "alcool":
                return 17000;
            case "diesel":
                return 25000;
            case "gas":
                return 30000;
            default:
                return -1;
        }
    }

    @Override
    public String toString() {
        return "cor: " + cor + "\nmodelo: " + modelo + "\ncombustivel: " + combustivel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((combustivel == null) ? 0 : combustivel.hashCode());
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
        Automovel other = (Automovel) obj;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (combustivel == null) {
            if (other.combustivel != null)
                return false;
        } else if (!combustivel.equals(other.combustivel))
            return false;
        return true;
    }

}