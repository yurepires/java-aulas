package POOAulas.aula02;

public class Cachorro extends Animal{
    // atributos/estado

    String raca;
    String nome;
    String dono;
    int idade;

    // comportamentos
    void latir(){
        System.out.println("Au au!");
    }

    void morder(){
        System.out.println("rrraaaaaaaaawww!!");
    }
}