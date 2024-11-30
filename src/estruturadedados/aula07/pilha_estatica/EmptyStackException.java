package estruturadedados.aula07.pilha_estatica;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super("Pilha vazia!");
    }
}
