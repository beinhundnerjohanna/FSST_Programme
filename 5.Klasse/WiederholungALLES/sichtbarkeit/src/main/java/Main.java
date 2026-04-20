import list.List;
import zoo.raubtiere.*;
import zoo.voegel.*;

public class Main {
    public static void main(String[] args) {

        Loewe l = new Loewe();
        Pinguin p = new Pinguin();

        l.gibLaut();
        l.jage();

        p.gibLaut();
        p.schwimme();

        /* Verkettete Liste */

        List li = new List();

        li.append(new Loewe());
        li.prepend(new Pinguin());

        li.print();

        //li.append(new Node(new Loewe("Simba", 5)));
    }
}