import java.text.NumberFormat;

public class ProdutoNaoPerecivel extends Produto {

    public ProdutoNaoPerecivel(String descricao, double precoCusto, double margemLucro) {
        super(descricao, precoCusto, margemLucro);
    }

    public ProdutoNaoPerecivel(String descricao, double precoCusto) {
        super(descricao, precoCusto);
    }

    public double valorDeVenda() {
        return precoCusto * (1 + margemLucro);
    }

    @Override
    public String toString() {
        NumberFormat moeda = NumberFormat.getCurrencyInstance();

        return String.format("Descrição: %s, Preço de Custo: %s, Margem de Lucro: %.2f%%, Valor de Venda: %s",
                descricao, moeda.format(precoCusto), margemLucro * 100, moeda.format(valorDeVenda()));
    }
}