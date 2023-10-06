public class OnibusGNV extends Onibus implements CombustivelLiquido {

    double alcance;
    int nivelEmissao;

    public OnibusGNV() {
        super(40, 1000000);
        alcance = 100;
        nivelEmissao = 2;
    }

    public OnibusGNV(int capacidade, double custo, double alcance, int nivelEmissao) {
        super(capacidade, custo);
        this.alcance = alcance;
        this.nivelEmissao = nivelEmissao;
    }

    @Override
    public double getAlcance() {

        return alcance;
    }

    @Override
    public int getNivelEmissao() {

        return nivelEmissao;
    }

    @Override
    public double getAceleracao() {

        return 3.0;
    }
}
