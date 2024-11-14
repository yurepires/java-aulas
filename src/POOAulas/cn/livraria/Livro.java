package POOAulas.cn.livraria;

public class Livro {
    private String titulo;
    private String descricao;
    private double preco;
    private String ISBN;
    private Autor autor;


    private Livro() {
    }

    public Livro(String ISBN){
        this.ISBN = ISBN;
    }

    public Livro(String titulo, String descricao, double preco, String ISBN) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.ISBN = ISBN;
    }

    public Livro(String titulo, String descricao, double preco, String ISBN, Autor autor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes(){
        System.out.println("Detalhes do Livro");
        System.out.println("Nome: " + this.titulo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("ISBN: " + this.ISBN);
        if (this.autor != null) this.autor.mostrarDetalhes();
        else System.out.println("Autor não cadastrado!");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", ISBN=" + ISBN +
                '}';
    }
}
