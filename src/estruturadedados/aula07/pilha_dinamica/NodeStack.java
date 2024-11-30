package estruturadedados.aula07.pilha_dinamica;

public class NodeStack implements IStack {
    Node top;
    int size;

    public NodeStack() {
        top = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String top() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Pilha vazia!");
        }
        return top.element;
    }

    @Override
    public void push(String element) {
        Node novoNode = new Node(element);
        novoNode.next = top;
        top = novoNode;
        size++;
    }

    @Override
    public String pop() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Pilha vazia!");
        }
        String temp = top();
        top = top.next;
        size--;
        return temp;
    }
}
