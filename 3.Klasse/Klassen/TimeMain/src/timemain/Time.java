package timemain;

public class Time {

    //Felder
    int h;
    int min;

    //Konstruktor
    Time(int h, int min) {
        this.h = h;
        this.min = min;
    }

    //Methoden
    
    public String toString(){
        return h+"Std"+min+"Min";
    }
    void add(Time t) {
        this.min =this.min + t.min;
        
        if(this.min>= 60)
        {
            this.min= this.min -60;
        }

        this.h = this.h + t.h;
    }

}
