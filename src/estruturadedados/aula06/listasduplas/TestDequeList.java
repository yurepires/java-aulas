package estruturadedados.aula06.listasduplas;

public class TestDequeList {
    public static void main(String[] args) {
        Node node1 = new Node("a");
        Node node2 = new Node("b");
        Node node3 = new Node("c");

        DequeList dequeList = new DequeList();
        dequeList.addFirst(node1);
        dequeList.addFirst(node2);
        dequeList.addFirst(node3);
    }
}
