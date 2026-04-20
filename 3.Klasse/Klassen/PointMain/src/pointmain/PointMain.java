package pointmain;

public class PointMain {

    public static void main(String[] args) {
        //Objekt erzeugen
        Point p1= new Point(1,1);
        Point p2 = new Point();
        Point p3 = new Point(4,6);
        
        
        //Methode aufrufen
        p1.translate(3, 2);
        p3.translate(-1, 1);
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("Abstand p1: "+p1.distanceFromOrigin());
        System.out.println("Abstand p2: "+p3.distanceFromOrigin());
    }

}
