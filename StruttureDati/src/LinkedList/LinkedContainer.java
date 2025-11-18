package LinkedList;

import java.util.*;

public class LinkedContainer<E> extends AbstractContainer<E>{
    //protected int size ereditata
    Node<E> head;

    public boolean add(E elem){
        Node <E>newNode = new Node<E>(elem,null);
        //se la head è null aggiunge il nodo appena creato alla testa
        if(head == null){head=newNode;size++;}
        else{
            //se il successivo di
            if (head.next==null)throw new NullPointerException();
            Node<E> curr = head.next;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next = newNode;
            size++;
            return true;
        }
        return false;
    }

    public void add(E elem,int index){
        if (index < 0 || index > size) throw new ArrayIndexOutOfBoundsException();
        Node<E>newNode = new Node<E>(elem,null);
        if (index == 0){
            Node<E> vecchioSuccHead = head.next;
            head = newNode;
            newNode.next = vecchioSuccHead;
            size++;
        }
        else {
            int cont = 0;

            Node<E> curr = head;
            while (cont < index-1 && curr != null) {
                curr = curr.next;
                cont++;
            }
            Node<E> vecchioSucc = curr.next;
            curr.next = newNode;
            newNode.next = vecchioSucc;
            size++;
        }
    }

    //metodo set cambia il valore di un nodo da fare per casa


    private static class Node<E>{
        E info;
        Node<E> next;

        public Node(E info, Node<E> next  ){
            this.info = info;
            this.next = next;
        }
    }




    private final class LCIterator implements Iterator<E>{
        private Node<E> prev;
        private Node<E> curr;

        //settare questa a true per concedere il remove dopo la next, e a false se si fa una remove
        private boolean isRemovable = false;
        @Override

        public boolean hasNext() {
            if(curr==null){
                return head != null;
            }else{
                return curr.next != null;
            }
        }

        @Override
        public E next() {
            if(!hasNext()) throw new NoSuchElementException();
            prev = curr;
            if (curr == null)curr=head;
            else curr=curr.next;
            E res = curr.info;

            isRemovable = true;
            return res;
        }

        @Override
        public void remove() {
            if(!isRemovable)throw new IllegalStateException();
            isRemovable = false;
            if (curr == head){
                head = head.next;
            }
            else{
                prev.next = curr.next;
            }
            curr = prev;
            size--;
        }
    }
}
