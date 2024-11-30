package estruturadedados.aula07.pilha_dinamica;

public interface IStack {

    int size();

    boolean isEmpty();

    String top();

    void push(String element);

    String pop();

}
