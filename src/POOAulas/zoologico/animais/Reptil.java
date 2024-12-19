package POOAulas.zoologico.animais;

public class Reptil extends Animal{
    private double temperaturaCorporal;

    public Reptil(String nome, String especie, double temperaturaCorporal) {
        super(nome, especie);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void emitirSom() {
        System.out.println("roooor");
    }
}
