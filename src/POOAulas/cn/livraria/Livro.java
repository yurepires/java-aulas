package POOAulas.cn.livraria;

public class Livro {
    private String titulo;
    private String descricao;
    private double preco;
    private int ISBN;

    public Livro(String titulo, String descricao, double preco, int ISBN) {
        this.titulo = titulo;
        this.preco = preco;
        this.ISBN = ISBN;
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
