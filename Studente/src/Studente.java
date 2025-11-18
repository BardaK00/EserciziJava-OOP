/**
 * Modella i dati principali di uno studente universitario.
 */
public interface Studente {

    /**
     * Restituisce il numero di matricola assegnato allo studente.
     */
    int getMatricola();

    /**
     * Restituisce il nome completo dello studente.
     */
    String getNome();

    /**
     * Restituisce la media attuale dei voti.
     */
    double getMediaVoti();

    /**
     * Restituisce l'iniziale del corso di laurea frequentato.
     */
    char getInizialeCorso();

    /**
     * Genera una descrizione testuale delle informazioni dello studente.
     */
    String toString();
}
