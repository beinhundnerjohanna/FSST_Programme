package zoo.voegel;

import zoo.basis.Schwimmfaehig;
import zoo.basis.Tier;

public class Pinguin extends Tier implements Schwimmfaehig{
    
    public Pinguin() {
        super("Pinguin", 0, "Vogel");
    }

    @Override
    public void gibLaut() {
        System.out.println("Noot Noot!");
    }

    public void schwimme(){
        System.out.println("*schwimmt*");
    }

}
