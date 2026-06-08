public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");

        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Email inválido.");

        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
}
