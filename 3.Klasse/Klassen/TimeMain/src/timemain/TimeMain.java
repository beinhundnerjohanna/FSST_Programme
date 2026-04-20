package timemain;

public class TimeMain {

    public static void main(String[] args) {
        Time t1 = new Time(5, 42);
        Time t2 = new Time(3, 27);
        
        t1.add(t2);
        System.out.println(t1);
    }

}
