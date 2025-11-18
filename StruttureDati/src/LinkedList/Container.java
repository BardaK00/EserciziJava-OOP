package LinkedList;
import java.util.*;

public interface Container<E> extends Iterable<E> {
    default int size(){
        //metodo default che cicla su tutti gli elementi per dare la size
        int c = 0;
        for (E e:this)c++;
        return c;
    }

    //ritorna l'elemento all'indice index muovendo l'iteratore
    default E get(int index){
        int i = 0;
        for (E e :this){
            if (index==i)return e;
            i++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    // non settabile da default perchè varia in base alla struttura dati
    E set(E elem,int index);

    //implementare la remove in base all'indice e dopo in base all'elemente passato come input
    //utilizzando il metodo iterator della classe iterator
    //Iterator<E> it = iterator()

    default E remove(int index){
        return null;
    }
    void add(E e,int index);
    boolean add(E e);
    //metodo clear
    //metodo contains
}
