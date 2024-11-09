package estruturadedados.aula04;

import java.util.Arrays;

public class Livraria {

    int size;

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

    public void adicionarTodos(Livro[] livros){
        for (int i=0; i < livros.length; i++){
            adicionarLivro(livros[i]);
        }
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
        for (int i=0; i < size - 1; i++){
            livros[i] = livros[i + 1];
        }
        removerUltimoElemento();
        return nomeLivroRemovido;
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "size=" + size +
                ", livros=" + Arrays.toString(livros) +
                '}';
    }
}