
public class Automovel {

    private String modelo;
    private String cor;
    private String combustivel;
    private Double preco;

    public Automovel() {
        modelo = "Fiat Uno";
        cor = "Preto";
        combustivel = "Gasolina";
        preco = valorAutomovel(combustivel);
    }

    public Automovel(String modelo, String cor, String combustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        preco = valorAutomovel(combustivel);
    }

    @Override
    public String toString() {
        return "Automovel: modelo = " + modelo + ", cor = " + cor + ", combustivel = " + combustivel + ", preco = "
                + preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public static Double valorAutomovel(String combustivel) {

        Double valor = 0.0;
        switch (combustivel) {
            case "Gasolina":
                valor = 20000.00;
                break;
            case "Alcool":
                valor = 17000.00;
                break;
            case "Diesel":
                valor = 25000.00;
                break;
            case "Gas":
                valor = 30000.00;
                break;
            default:
                throw new IllegalArgumentException("Tipo de combustivel inexistente");
        }
        return valor;
    }
}