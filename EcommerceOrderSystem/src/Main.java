public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500, 10);
        Produto p2 = new Produto("Mouse", 50, 100);

        Cliente cliente = new Cliente("João", "joao@email.com");

        Pagamento pagamento = new Pix(); // Pode trocar para Cartao ou Boleto

        Pedido pedido = new Pedido(cliente, pagamento);

        pedido.adicionarProduto(p1, 1);
        pedido.adicionarProduto(p2, 2);

        pedido.fecharPedido();

        System.out.println("Total do pedido: R$ " + pedido.getTotal());
    }
}
