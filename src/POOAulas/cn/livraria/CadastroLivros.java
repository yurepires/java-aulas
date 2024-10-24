package POOAulas.cn.livraria;

import java.util.ArrayList;
import java.util.List;

public class CadastroLivros {

    private List<Livro> livroList;

    public CadastroLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String descricao ,double preco, int ISBN){
        livroList.add(new Livro(titulo, descricao, preco, ISBN));
    }

    public void removerLivro(String titulo){
        List<Livro> livrosParaRemover = new ArrayList<>();
    }
}
