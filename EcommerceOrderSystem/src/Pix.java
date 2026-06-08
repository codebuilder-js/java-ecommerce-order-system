public class Pix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Valor inválido.");

        System.out.println("Pagamento via PIX: R$ " + valor);
    }
}
