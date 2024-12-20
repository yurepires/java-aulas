package POOAulas.zoologico.animais;

public class Reptil extends Animal{
    private double temperaturaCorporal;

    public Reptil(String nome, String grupo, double temperaturaCorporal) {
        super(nome, grupo);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void emitirSom() {
        System.out.println("roooor");
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }
}