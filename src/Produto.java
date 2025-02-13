public abstract class Produto {
    private static final double MARGEM_PADRAO = 0.2;
    public String descricao;
    protected double precoCusto;
    protected double margemLucro;


    private void init(String descricao, double precoCusto, double margemLucro) {
        if (descricao.length() < 3 || precoCusto <= 0 || margemLucro <= 0)
            throw new IllegalArgumentException("Valores inválidos para o produto");
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.descricao = descricao;
    }

    public Produto(String descricao, double precoCusto, double margemLucro) {
        init(descricao, precoCusto, margemLucro);
    }

    public Produto(String descricao, double precoCusto) {
        init(descricao, precoCusto, MARGEM_PADRAO);
    }

    public abstract double valorDeVenda();

    @Override
    public abstract String toString();
}
