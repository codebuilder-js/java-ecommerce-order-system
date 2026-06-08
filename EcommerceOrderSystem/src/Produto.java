public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");

        if (preco <= 0)
            throw new IllegalArgumentException("Preço inválido.");

        if (estoque < 0)
            throw new IllegalArgumentException("Estoque inválido.");

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }

    public void reduzirEstoque(int quantidade) {
        if (quantidade <= 0)
            throw new IllegalArgumentException("Quantidade inválida.");

        if (quantidade > estoque)
            throw new IllegalArgumentException("Estoque insuficiente.");

        estoque -= quantidade;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
