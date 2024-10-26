package POOAulas.cn.livraria;

public class Autor {
    private String nomeAutor;
    private String emailAutor;
    private String cpfAutor;

    public Autor(String nomeAutor, String emailAutor, String cpfAutor) {
        this.nomeAutor = nomeAutor;
        this.emailAutor = emailAutor;
        this.cpfAutor = cpfAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEmailAutor() {
        return emailAutor;
    }

    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    public void mostrarDetalhes(){
        System.out.println("Detalhes do Livro");
        System.out.println("Autor: " + this.nomeAutor);
        System.out.println("Email: " + this.emailAutor);
        System.out.println("CPF do autor: " + this.cpfAutor);
    }
}
