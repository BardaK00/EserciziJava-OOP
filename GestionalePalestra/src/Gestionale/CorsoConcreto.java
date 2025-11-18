package Gestionale;

public class CorsoConcreto implements Corso,Comparable{
    private CodiceCorso codiceCorso;
    private String nome;
    
    @Override
    public CodiceCorso codice() {
        return null;
    }

    @Override
    public String nome() {
        return "";
    }

    @Override
    public int capacitaMassima() {
        return 0;
    }

    @Override
    public int numeroIstruttori() {
        return 0;
    }

    @Override
    public Orario orario() {
        return null;
    }

    @Override
    public int durataMinuti() {
        return 0;
    }

    @Override
    public Intensita intensita() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
