import java.util.*;
// il tipo generico E può essere limitata attraverso un upper bound
//partendo da object a scendere in ognuna delle classi esistenti
// si chiama bound
public final class Utils  {
    private Utils(){}

    // con extends Comparable<E> siamo sicuri che gli elementi che vengono passati all'interno del metodo
    //estendano Comparable quindi possono essere comparati ,senza il rischio che si passi al metodo una
    //collection che contine dati non Comparable
    public static <E extends Comparable<E>> E maxEl(Collection <E> c){
        //c'è la possibbilità di aggiungere più bound concatenati da & , riducendo così l'insieme
        //delle classi passabili al metodo


        //tutte le E del metodo vengono sostituiti da Comparable<E> facendo così un specie di casting
        //in generale il compilatore sostituisce la prima classe dopo l'extends
        if (c == null||c.isEmpty())throw new IllegalArgumentException();
        Iterator<E> it = c.iterator();
        E max = it.next();
        while(it.hasNext()){
            E elem = it.next();
            if (elem.compareTo(max) >0){
                max=elem;
            }
        }

        return max;
    }

//

    //siccome c1 consuma gli elementi di c2 devo poter mettere ?super E in c1 seguendo la regola pec
    public static <E> void addOn(Collection<? super E> c1,Collection<E> c2){
        if(c1 == null || c2 == null)throw new IllegalArgumentException();
        for(E c:c2){
            c1.add(c);
        }
    }

}
//PECS
//producer extends (PE) è il ? nelle parentesi <? extends Collection> ha fuzionamento di upper bound
//quindi gli oggetti saranno del sottotipo esteso

//consumer super (CS) si indica con <? super LinkedList> questo funge da lowerbound, quindi le variabili
//istanziate così potranno avere 1 solo supertipo di linkedlist

//se il metodo ritorna (produce) allora estends
//se il metodo prende(consuma) allora super