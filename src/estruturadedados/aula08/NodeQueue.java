package estruturadedados.aula08;

public class NodeQueue implements IQueue{

    Node front, tail;
    int size;

    public NodeQueue(){
        front = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public String front() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Fila vazia!");
        }
        return front.element;
    }

    @Override
    public void enqueue(String element) {
        Node novoNode = new Node(element);
        if (isEmpty()){
            front = novoNode;
            tail = novoNode;
            size++;
        }
        tail.next = novoNode;
        tail = novoNode;
        size++;
    }

    @Override
    public String dequeue() {
        if (isEmpty()){
            throw new RuntimeException("Fila vazia");
        }
        String nodoExcluido = front.element;
        front = front.next;
        size--;
        return nodoExcluido;
    }
}
