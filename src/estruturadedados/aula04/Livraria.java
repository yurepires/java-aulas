package estruturadedados.aula04;

public class Livraria {

    int size;

    int capacidade = 100;

    Livro livros[];

    public Livraria(int tam) {
        livros = new Livro[tam];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void adicionarLivro(Livro livro) throws RuntimeException{
        if (size == livros.length) throw new RuntimeException("Limite de capacidade atingido!");
        livros[size++] = livro;
    }

    public Livro buscarLivro(String nome) throws RuntimeException{
        if (isEmpty()) throw new RuntimeException("Não há livros!");
        for (Livro l: livros) if (l.getNome().equals(nome)) return l;
        return null;
    }
}