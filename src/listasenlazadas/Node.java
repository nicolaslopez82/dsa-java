package listasenlazadas;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T data;
    Node next;

    @Override
    public int compareTo(Node<T> tNode) {
        if(this.data.equals(tNode.data)){
         return 0;
        }
        else if(this.data.compareTo(tNode.data) < 0){
            return -1;
        }else {
            return 1;
        }
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
     this.next = next;
    }

    public void updateData(T data) {
        this.data = data;
    }
}
