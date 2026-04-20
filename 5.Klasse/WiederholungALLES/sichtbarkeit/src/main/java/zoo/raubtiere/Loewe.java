package zoo.raubtiere;

import zoo.basis.Tier;
import zoo.basis.Jagdfaehig;

public class Loewe extends Tier implements Jagdfaehig{

    public Loewe() {
        super("Löwe", 0, "Raubtier");
    }

    public Loewe(String name, int alter) {
        super(name, alter, "Raubtier");
    }


    public void exp() {
        System.out.println(getName() + ", "+ alter + ", "+art);
    }

    public void gibLaut() {
        System.out.println("raawwwr");
    };


    public void jage(){
        System.out.println("*Jagt*");
    }

}
