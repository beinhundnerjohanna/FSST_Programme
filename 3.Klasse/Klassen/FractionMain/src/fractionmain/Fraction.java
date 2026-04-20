package fractionmain;

public class Fraction {

    //Felder
    int z;
    int n;

    //Konstruktor
    Fraction(int z, int n) {
        this.z = z;
        this.n = n;
    }

    //Methoden
    
    public String toString(){
        return z+"/"+n;
    }
            
    void mult(Fraction f) {
        
        this.z= this.z * f.z;
        this.n= this.n * f.n;
    }
    
    void add(Fraction f){
        if(this.n == f.n)
        {
            this.z= this.z+f.n;
        }
        else{
            this.z=(this.z*f.n)+(f.z*this.n);
            this.n= this.n*f.n;
        }
    }

}
