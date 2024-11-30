package estruturadedados.aula07.pilha_estatica;

public class VectorStack implements IStack{
    int capacidade;

    String[] S;

    int size = 0;

    public VectorStack(int capacidade) {
        this.capacidade = capacidade;
        S = new String[capacidade];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String top() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return S[size - 1];
    }

    @Override
    public void push(String element) {
        if (size == capacidade){
            throw new FullStackException();
        }

        S[size - 1] = element;
        size++;
    }

    @Override
    public String pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        String temp = top();
        S[size - 1] = null;
        size--;
        return temp;
    }
}