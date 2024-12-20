package POOAulas.zoologico.animais;

public class Ave extends Animal{
    private String tipoPenas;

    public Ave(String nome, String grupo, String tipoPenas) {
        super(nome, grupo);
        this.tipoPenas = tipoPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println("bem-te-vi");
    }

    public String getTipoPenas() {
        return tipoPenas;
    }

    public void setTipoPenas(String tipoPenas) {
        this.tipoPenas = tipoPenas;
    }
}