package Gestionale;

public interface Corso extends Comparable<CodiceCorso>{
    CodiceCorso codice();
    String nome();
    int capacitaMassima();
    int numeroIstruttori();
    Orario orario();
    int durataMinuti();
    Intensita intensita();
}
