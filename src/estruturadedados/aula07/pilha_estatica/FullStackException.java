package estruturadedados.aula07.pilha_estatica;

public class FullStackException extends RuntimeException{

    public FullStackException(){
        super("Pilha cheia!");
    }
}
