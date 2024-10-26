package POOAulas.cn.livraria;

public class CadastroLivros {

    public static void main(String[] args) {
        Autor autorJava = new Autor("yure","yure@gmail.com","99999");

        Livro livroJava = new Livro();

        livroJava.setTitulo("Java como Programar");
        livroJava.setDescricao("Primeiros passos");
        livroJava.setPreco(39.90);
        livroJava.setISBN(12345);
        livroJava.setAutor(autorJava);

        livroJava.mostrarDetalhes();

        Livro outroLivro = new Livro("Python para iniciantes", "Livro Python básico", 119.90, 12346);

        outroLivro.mostrarDetalhes();
    }
}