package Biblioteca;
import java.util.*;

public abstract class BiblioAbstract implements Biblioteca {


    public String toString(){
        String ret = "";
        List<Libro> lista = this.ordinaPerTitolo();
        for (Libro l : lista){
            ret += l;
            ret += "\n";

        }
        return ret;
    }

    public boolean equals(Object o){
        if(o==null) return false;
        if (o==this) return true;
        if (!(o instanceof BiblioAbstract))return false;
        else{
            BiblioAbstract other = (BiblioAbstract)o;
            return ordinaPerTitolo().equals(other.ordinaPerTitolo());}
    }

    public int hashCode(){
        return this.ordinaPerTitolo().hashCode();
    }


}
