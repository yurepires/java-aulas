package POOAulas.zoologico.animais;

public abstract class Animal {
    static private int contador_id = 1;
    private int id;
    private String nome;
    private String especie;
    private boolean sendoCuidado;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
        this.id = contador_id++;
        this.sendoCuidado = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isSendoCuidado() {
        return sendoCuidado;
    }

    public void setSendoCuidado(boolean sendoCuidado) {
        this.sendoCuidado = sendoCuidado;
    }

    public abstract void emitirSom();

}
