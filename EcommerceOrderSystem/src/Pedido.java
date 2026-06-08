import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;

    public Pedido(Cliente cliente, Pagamento pagamento) {
        if (cliente == null)
            throw new IllegalArgumentException("Cliente obrigatório.");

        if (pagamento == null)
            throw new IllegalArgumentException("Pagamento obrigatório.");

        this.cliente = cliente;
        this.pagamento = pagamento;
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto == null)
            throw new IllegalArgumentException("Produto inválido.");

        if (quantidade <= 0)
            throw new IllegalArgumentException("Quantidade inválida.");

        produto.reduzirEstoque(quantidade);

        itens.add(new ItemPedido(produto, quantidade));
    }

    public double getTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void fecharPedido() {
        if (itens.isEmpty())
            throw new IllegalStateException("Pedido vazio.");

        pagamento.processarPagamento(getTotal());

        System.out.println("Pedido finalizado para: " + cliente.getNome());
    }
}
