package POOAulas.zoologico.animais;

public class Mamifero extends Animal{
    private int tempoGestacao;

    public Mamifero(String nome, String grupo, int tempoGestacao) {
        super(nome, grupo);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    @Override
    public void emitirSom() {
        System.out.println("iiirrrrí");
    }
}