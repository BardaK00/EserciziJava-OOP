package Biblioteca;

import java.util.Objects;

public class LibroConcreto implements Libro {
    private String titolo;
    private Autore autore;
    private int anno;
    private String genere;
    private boolean disponibilità;
    private String prestatoA = null;

    public LibroConcreto(String titolo, boolean disponibilità, String genere, int anno, Autore autore) {
        if (titolo == null || genere == null || autore == null||anno<=1600) throw new IllegalArgumentException("uno dei campi specificati non è valido");
        this.titolo = titolo.toLowerCase().trim();
        this.disponibilità = disponibilità;
        this.genere = genere;
        this.anno = anno;
        this.autore = autore;
    }

    public String toString(){
        return "Titolo:"+titolo+"\n"+"Autore:"+autore+"\n"+"Anno:"+anno+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LibroConcreto that)) return false;
        return anno == that.anno && Objects.equals(getTitolo(), that.getTitolo()) && Objects.equals(getAutore(), that.getAutore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitolo(), getAutore(), anno);
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    @Override
    public Autore getAutore() {
        return autore;
    }

    @Override
    public int getAnnoPubblicazione() {
        return anno;
    }

    @Override
    public boolean isDisponibile() {
        return disponibilità;
    }

    @Override
    public void presta(String utente) {
        if (utente==null)throw new IllegalArgumentException();

        if(!this.isDisponibile()){
            System.out.println("Libro non presente in database");
        }else{
            this.disponibilità = false;
            this.prestatoA = utente;
            System.out.println("libro prestato a:"+utente);
        }
    }

    @Override
    public void restituisci() {
        if(this.isDisponibile()){
            System.out.println("Libro già presente in database");
        }else{
            this.disponibilità = true;
            this.prestatoA = null;
            System.out.println("libro restituito");
        }

    }

    @Override
    public int compareTo(Libro o) {
        return 0;

    }
}
