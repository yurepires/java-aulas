package POOAulas.zoologico.animais;

public class Ave extends Animal{
    private String tipoPenas;

    public Ave(String nome, String especie, String tipoPenas) {
        super(nome, especie);
        this.tipoPenas = tipoPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println("bem-te-vi");
    }
}
