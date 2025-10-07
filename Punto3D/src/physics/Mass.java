package physics;

public class Mass {
    private double mass;

    //COSTRUTTORE
    public Mass(double m){
        if (m>=0){
            mass = m;}
        else{
            mass = 0.0;
        }
    }

    public double getM(){
        return mass;
    }

    public String toString(){
        return "mass="+mass;
    }
}
