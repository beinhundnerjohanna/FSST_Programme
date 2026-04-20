package fractionmain;

public class FractionMain {

    public static void main(String[] args) {
        
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3,4);
        
        a.add(b);
        System.out.println("Addiert:" +a);
        
        a.mult(b);
        System.out.println("Multipliziert:" +a);
    }
    
}
