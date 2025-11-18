package Biblioteca;

import java.util.ArrayList;
import java.util.*;

public class BiblioConcreta implements Biblioteca{
    List<Libro> catalogo = new ArrayList<>();
    Set<Autore> autori = new HashSet<>();


    @Override
    public void aggiungiLibro(Libro l) {
        if (catalogo.contains(l)) throw new IllegalArgumentException("Libro già presente");
        catalogo.add(l);
        autori.add(l.getAutore());
    }

    @Override
    public void rimuoviLibro(String titolo) {
        String autoreDaControllare = null;
        for(Libro l:catalogo){
            if (l.getTitolo().equals(titolo)){
                catalogo.remove(l);
                autoreDaControllare=l.getAutore().cognome();
                break;
            }

        }

        for(Autore a:autori){
            if(a.cognome().equals(autoreDaControllare)){
                if (this.cercaPerAutore(autoreDaControllare).isEmpty()) autori.remove(a);
            }
        }

    }

    @Override
    public List<Libro> cercaPerAutore(String cognome) {
        List<Libro> ret = new ArrayList<>();
        for (Libro l : catalogo){
            if (l.getAutore().cognome().equals(cognome)) ret.add(l);
        }
        return ret;
    }

    @Override
    public List<Libro> ordinaPerTitolo() {
        List<Libro>catCopy = new LinkedList<>(catalogo);
        Collections.sort(catCopy);
        return catCopy;

    }

    @Override
    public List<Libro> ordinaPerAnno() {
        List<Libro>catCopy = new LinkedList<>(catalogo);
        Collections.sort(catCopy,(l1,l2)->l1.getAnnoPubblicazione()-l2.getAnnoPubblicazione());
        return catCopy;
    }

    @Override
    public Iterator<Libro> iterator() {
        return catalogo.listIterator();
    }


}
