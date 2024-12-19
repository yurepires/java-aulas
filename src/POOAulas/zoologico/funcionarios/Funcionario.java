package POOAulas.zoologico.funcionarios;

import POOAulas.zoologico.animais.Animal;

public class Funcionario {
    private static int contador_id = 1;
    private int id;
    private String nome;
    private String especialidade;
    private boolean cuidandoAnimal;

    public Funcionario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.id = contador_id++;
        this.cuidandoAnimal = false;
    }

    public void cuidarAnimal(Animal animal){
        System.out.printf("Funcionário %s está cuidando do animal %s", this.nome, animal.getNome());
        this.cuidandoAnimal = true;
        animal.setSendoCuidado(true);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isCuidandoAnimal() {
        return cuidandoAnimal;
    }

    public void setCuidandoAnimal(boolean cuidandoAnimal) {
        this.cuidandoAnimal = cuidandoAnimal;
    }
}
