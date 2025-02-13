import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
    private static final double MARGEM_PADRAO = 0.28;
    private static final int PADRAO_DESCONTO = 7;
    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate dataDeValidade) {
        super(desc, precoCusto, margemLucro);
        this.dataDeValidade = dataDeValidade;
    }

    public double valorDeVenda() {
        return precoCusto * (1 + margemLucro);
    }

    @Override
    public String toString() {
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("Descrição: %s, Preço de Custo: %s, Margem de Lucro: %.2f%%, Valor de Venda: %s, Data de Validade: %s",
                descricao, moeda.format(precoCusto), margemLucro * 100, moeda.format(valorDeVenda()), dataDeValidade.format(formatoData));
    }
}