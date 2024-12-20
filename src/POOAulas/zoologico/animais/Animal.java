package POOAulas.zoologico.animais;

public abstract class Animal {
    static private int contador_id = 1;
    static private int totalAnimais = 0;
    private final int id;
    private String nome;
    private String grupo;
    private boolean sendoCuidado;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.grupo = especie;
        this.id = contador_id++;
        this.sendoCuidado = false;
        totalAnimais++;
    }

    public static int getTotalAnimais() {
        return totalAnimais;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isSendoCuidado() {
        return sendoCuidado;
    }

    public void setSendoCuidado(boolean sendoCuidado) {
        this.sendoCuidado = sendoCuidado;
    }

    public abstract void emitirSom();

}