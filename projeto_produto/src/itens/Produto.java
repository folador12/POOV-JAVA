package itens;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Produto {
    private long codigo;
    private String nome;
    private String descricao;
    private BigDecimal precoCompra;
    private LocalDate dataCompra;
    private LocalDate dataValidade;
    private Situacao situacao;
    private String marca;
    private int quantMinima;
    private int quantAtual;

    Scanner s = new Scanner(System.in);

    public Produto() {
        codigo = 0L;
        nome = "Sem nome";
        descricao = "Sem descrição";
        marca = "Sem marca";
        precoCompra = BigDecimal.ZERO;
        dataCompra = dataValidade = LocalDate.now();
        quantAtual = quantMinima = 0;
        situacao = Situacao.INVALIDO;
    }

    public Produto(long codigo, String nome, String descricao, BigDecimal precoCompra, LocalDate dataCompra,
            LocalDate dataValidade, Situacao situacao, String marca, int quantMinima, int quantAtual) {

        setCodigo(codigo);
        setNome(nome);
        setDescricao(descricao);
        setPrecoCompra(precoCompra);
        setDataCompra(dataCompra);
        setDataValidade(dataValidade);
        setSituacao(situacao);
        setMarca(marca);
        setQuantMinima(quantMinima);
        setQuantAtual(quantAtual);

    }

    public boolean isVencido() {
        if (dataValidade.isBefore(LocalDate.now())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmFalta() {
        if (quantAtual < quantMinima) {
            return true;
        } else {
            return false;
        }
    }

    public void setCodigo(long codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Codigo invalido!");
        }

    }

    public long getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        if (nome.length() <= 1) {
            throw new IllegalArgumentException("Nome invalido!");
        } else {
            this.nome = nome;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() < 1) {
            throw new IllegalArgumentException("Nome invalido!");
        } else {
            this.descricao = descricao;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        if (precoCompra.compareTo(BigDecimal.ZERO) == -1) {
            throw new IllegalArgumentException("Preço da compra invalido!");
        } else {
            this.precoCompra = precoCompra;
        }

    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        if (!dataCompra.isBefore(LocalDate.now())) {
            this.dataCompra = dataCompra;
        } else {
            throw new IllegalArgumentException("Data da compra invalido!");
        }
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataValidade(LocalDate dataValidade) {
        if (!dataValidade.isBefore(LocalDate.now())) {
            this.dataValidade = dataValidade;
        } else {
            throw new IllegalArgumentException("Data da validade invalido!");
        }
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setMarca(String marca) {
        if (marca.length() > 1) {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("Marca invalido!");
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setQuantMinima(int quantMinima) {
        if (quantMinima >= 0) {
            this.quantMinima = quantMinima;
        } else {
            throw new IllegalArgumentException("Quantidade minima invalido!");
        }

    }

    public int getQuantMinima() {
        return quantMinima;
    }

    public void setQuantAtual(int quantAtual) {
        if (quantAtual > 0) {
            this.quantAtual = quantAtual;
        } else {
            throw new IllegalArgumentException("Quantidade maxima invalido!");
        }
    }

    public int getQuantAtual() {
        return quantAtual;
    }

    DateTimeFormatter formator = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void mostrar() {
        String texto = codigo + ", " + nome + ", " + descricao + ", " + precoCompra + ", " + formator.format(dataCompra)
                + ", " + formator.format(dataValidade) + ", " + situacao + ", " + marca + ", " + quantMinima + ", "
                + quantAtual + ", Está em falta: " + isEmFalta() + ", Está vencido: " + isVencido();

        System.out.println(texto);
    }

    public Produto obterProduto() {
        Produto produto = new Produto();
        int entrada = 0;
        System.out.print("Insira o codigo do produto: ");
        produto.setCodigo(Long.parseLong(s.nextLine()));
        System.out.print("Insira o nome do produto: ");
        produto.setNome(s.nextLine());
        System.out.print("Insira o descrição do produto: ");
        produto.setDescricao(s.nextLine());
        System.out.print("Insira o Preço da compra: ");
        produto.setPrecoCompra(new BigDecimal(s.nextLine()));
        System.out.print("Insira a data da compra: ");
        produto.setDataCompra(LocalDate.parse(s.nextLine(), formator));
        System.out.print("Insira a data da validade do produto: ");
        produto.setDataValidade(LocalDate.parse(s.nextLine(), formator));
        System.out.print("Insira a situação do produto: ");
        do {
            System.out.println("Escolha a situacao");
            System.out.println("1 - Válido");
            System.out.println("2 - Inválido");
            System.out.println("3 - Descontinuado");
            System.out.print("Situacao: ");
            entrada = Integer.parseInt(s.nextLine());
            switch (entrada) {
                case 1:
                    produto.setSituacao(Situacao.VALIDO);
                    break;
                case 2:
                    produto.setSituacao(Situacao.INVALIDO);
                    break;
                case 3:
                    produto.setSituacao(Situacao.DESCONTINUADO);
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (entrada < 1 || entrada > 3);
        ;
        System.out.print("Insira a marca do produto: ");
        produto.setMarca(s.nextLine());
        System.out.print("Insira a quantidade minima do produto: ");
        produto.setQuantMinima(Integer.parseInt(s.nextLine()));
        System.out.print("Insira a quantidade atual do produto: ");
        produto.setQuantAtual(Integer.parseInt(s.nextLine()));

        s.close();

        return produto;
    }
}
