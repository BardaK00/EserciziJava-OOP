package LinkedList;

import java.util.Iterator;

public class AbstractContainer<E> implements Container<E> {
    protected int size;

    public int size() {
        return size;
    }


    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();
        E el = Container.super.remove(index);
        return el;
    }

    @Override
    public E set(E elem, int index) {
        return null;
    }

    @Override
    public void add(E e, int index) {
    }

    @Override
    public boolean add(E e) {
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    //classe che viene utilizzata per la rappresentazione di stringhe in modo efficiente
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<E> it = iterator();
        if (!it.hasNext()) sb.append("}");
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(",");
            else {
                sb.append("]");
            }
        }
        return sb.toString();
    }
}