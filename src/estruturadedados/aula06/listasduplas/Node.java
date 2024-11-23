package estruturadedados.aula06.listasduplas;

public class Node {
    String element;
    Node next;
    Node previous;

    public Node(String element){
        this.element = element;
        next = null;
        previous = null;
    }

}
