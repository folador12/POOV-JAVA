public class Hibrido extends Onibus implements Eletrico, CombustivelLiquido {

    double tensao;
    double alcance;
    int nivelEmissao;

    public Hibrido() {
        super(40, 1000000);
        tensao = 110;
        alcance = 100;
        nivelEmissao = 1;
    }

    public Hibrido(int capacidade, double custo, double tensao, double alcance, int nivelEmissao) {
        super(capacidade, custo);
        this.tensao = tensao;
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
    public double getTensao() {

        return tensao;
    }

    @Override
    public double getAceleracao() {

        return 4.0;
    }

}
