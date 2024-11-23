package estruturadedados.aula06.listasduplas;

public class DequeList {
    Node header;
    Node trailer;
    int size;

    public DequeList() {
        this.header = new Node("header");
        this.trailer = new Node("trailer");
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(Node newNode){

        if (isEmpty()) {
            header.next = newNode;
            trailer.previous = newNode;
            size++;
        } else {
            Node first = header.next;
            header.next = newNode;
            first.previous = newNode;
            newNode.previous = header;
            newNode.next = first;
        }
    }

    public Node removeFirst(){
        Node primeiro = trailer.next;
        Node segundo = primeiro.next;

        segundo.previous = trailer;
        trailer.next = segundo;

        size--;
        return primeiro;
    }

}
