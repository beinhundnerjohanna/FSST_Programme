package pointmain;

public class Point {

    //Felder
    int x;
    int y;

    //Konstruktor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        x = 0;
        y = 0;
    }

    //Methoden
    void translate(int dx, int dy) {
        this.x = this.x + dx;
        y = y + dy;
    }

    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return x + "/" + y;
    }
}
