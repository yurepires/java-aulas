package estruturadedados.aula04;

public class Livro {
    private String nome;

    public Livro() {
    }

    public Livro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
