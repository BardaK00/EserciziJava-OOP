package geom;

public class Punto3DCartesiano implements Punto3D
{

    private double x;
    private double y;
    private double z;

    //COSTRUTTORE DA INPUT
    public Punto3DCartesiano(double x, double y, double z){
        this.x = x;
        this.y=y;
        this.z=z;
    }
    // COSTRUTTORE PER COPIA
    public Punto3DCartesiano(Punto3D other){
        if (other != null){
            x = other.getX();
            y = other.getY();
            z = other.getZ();
        }
        else{
            throw new NullPointerException("Il punto passato non può essere null");
        }
    }

    //COSTRUTTORE DI DEFAULT
    public Punto3DCartesiano(){}

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getZ() {
        return z;
    }

    public String toString(){
        return "(x:"+x+","+"y:"+y+","+"z:"+z+",)";
    }

}
