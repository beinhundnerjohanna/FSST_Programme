package namesmain;

public class NamesMain {

    public static void main(String[] args) {
        Name name1, name2;

        name1 = new Name();
        name2 = new Name();

        name1.firstName = "Laura";
        name1.lastName = "Brandacher";

        name2.firstName = "Lara";
        name2.lastName = "Brandbauer";
        
        System.out.println(name1.firstName+" "+name1.lastName);
        System.out.println(name2.firstName+" "+name2.lastName);
    }

}
