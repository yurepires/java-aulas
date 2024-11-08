package estruturadedados.aula04;

public class TesteLivraria {

    public static void main(String[] args) {
        Livro livros[] = {
                new Livro("Python"),
                new Livro("Java"),
                new Livro("C#"),
                new Livro("C++"),
                new Livro("Assembly")
        };

        Livraria livraria = new Livraria(livros.length);

        System.out.println(livraria);
        livraria.removerPrimeiroElemento();

        System.out.println(livraria);
    }

}
