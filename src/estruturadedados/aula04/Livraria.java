package estruturadedados.aula04;

import java.util.Arrays;

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
        for (Livro l: livros) if (l.getNome().equalsIgnoreCase(nome)) return l;
        return null;
    }

    public String removerUltimoElemento() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
        String nomeLivroRemovido = livros[size - 1].getNome();
        livros[--size] = null;
        return nomeLivroRemovido;
    }

    public String removerPrimeiroElemento() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        String nomeLivroRemovido = livros[0].getNome();
        livros[0] = null;
        size--;
        for (int i=1; i < size; i++){
            livros[i] = livros[i + 1];
        }
        removerUltimoElemento();
        return nomeLivroRemovido;
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "size=" + size +
                ", capacidade=" + capacidade +
                ", livros=" + Arrays.toString(livros) +
                '}';
    }
}