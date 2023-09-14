package itens;

public enum Situacao {
    VALIDO("Válido"),
    INVALIDO("Inválido"),
    DESCONTINUADO("Descontinuado");

    private String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
