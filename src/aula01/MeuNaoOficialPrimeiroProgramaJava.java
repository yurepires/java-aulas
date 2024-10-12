package aula01;

public class MeuNaoOficialPrimeiroProgramaJava {

    public static void main(String[] args) {
        Cachorro doguinho = new Cachorro();
        doguinho.dono = "Carlos William";
        doguinho.idade = 10;
        doguinho.nome = "Sansão";
        doguinho.raca = "Rottweiler";

        System.out.println("Nome do pet: " + doguinho.nome + "\nIdade: " + doguinho.idade);

        doguinho.latir();
    }
}
