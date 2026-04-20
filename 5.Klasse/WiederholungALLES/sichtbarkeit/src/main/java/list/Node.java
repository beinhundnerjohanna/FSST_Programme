package list;
import zoo.basis.*;

public class Node {
    private Tier data;
    private Node next;

    // Konstruktor
    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(Tier data){
        this.data = data;
        this.next = null;
    }

    // Setter und Getter
    public void setData(Tier data) {
        this.data = data;
    }

    public Tier getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
