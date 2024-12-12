package estruturadedados.aula06.listassimples;

public class SimpleList {
    Node head;

    Node tail;

    int size;

//    TODO:
//    Ajeitar os metódos

    public SimpleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insertFirst(String data){
        Node newNode = new Node(data);
        Node temp = head;
        head = newNode;
        head.next = temp;
        size++;
    }

    public void removeFirst() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Vetor vazio!");
        }
        head = head.next;
        size--;
    }

    public Node removeLast() throws RuntimeException{
        if (isEmpty()){
            throw new RuntimeException("Vetor vazio!");
        }

        Node current = head.next;
        Node previous = head;

        while (current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        tail = previous;
        size--;
        return previous;
    }
}
