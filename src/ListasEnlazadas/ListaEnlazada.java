package ListasEnlazadas;

public class ListaEnlazada <T> {
    private Node head;
    private Node tail;

    public ListaEnlazada() {
        head = null;
        tail = null;
    }
    public ListaEnlazada(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    //Insert node to the end.
    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        }else  {
            tail = newNode;
            tail.next = null;
        }
    }

    //Remove node.
    public void removeNode(Node removeNode) {
        if (head == null) {
            return;
        }else {
            removeNode.next = null;
        }
    }

    //Remove node by value.
    public void removeNodeByValue( T data){
        if (head == null) {
            return;
        }
        Node nodeToRemove = findNodeByValue(data);
        if(nodeToRemove != null){
            nodeToRemove.next = null;
        }
    }

    //Find node.
    public Node findNodeByValue(T data){

        if (head == null) {
            return null;
        }

        Node current = head;
        while (current.next != null) {
            if (current.getData().equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    //Insert node to the end.
    public void insertNodeToTheEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
}
