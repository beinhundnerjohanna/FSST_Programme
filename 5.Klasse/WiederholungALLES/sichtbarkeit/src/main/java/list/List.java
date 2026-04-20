package list;

import zoo.basis.Tier;

public class List {
    private Node start;

    public List() {
        this.start = new Node();
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getStart() {
        return start;
    }

    public void append(Tier data) {

        Node n = new Node(data);
        if (start == null) {
            start = n;
            return;
        } else {
    
            Node current = start;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(n);
        }
    }

    public void prepend(Tier data) {
        if (start == null) {
            start = new Node(data);
        } else {
            Node n = new Node(data);
            n.setNext(start);
            start = n;
        }
    }

    public void print() {
        Node current = start;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}
