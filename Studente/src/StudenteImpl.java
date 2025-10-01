/**
 * Implementazione concreta dell'interfaccia Studente con campi basilari.
 */

public class StudenteImpl implements Studente{
    private int matricola;
    private String nome;
    private double mediaVoti;
    private boolean isFuoriCorso;
    private char inizialeCorso;

    /**
     * Inizializza uno studente con tutti gli attributi forniti.
     */
    public StudenteImpl(int mat,String name, double[] media,boolean fuoriC,char corso){

        matricola = mat;
        nome = name;
        MediaVoti voti =new MediaVoti(media);
        mediaVoti = voti.getMedia();
        isFuoriCorso = fuoriC;
        inizialeCorso = corso;

    }
    /**
     * Restituisce la matricola memorizzata.
     */
    @Override
    public int getMatricola() {
        return matricola;
    }

    /**
     * Restituisce il nome assegnato allo studente.
     */
    @Override
    public String getNome() {
        return nome;

    }

    /**
     * Fornisce la media dei voti accumulata finora.
     */
    @Override
    public double getMediaVoti() {
        return mediaVoti;
    }

    /**
     * Indica la lettera associata al corso di studi.
     */
    @Override
    public char getInizialeCorso() {
        return inizialeCorso;
    }

    /**
     * Compone una stringa riepilogativa dei dati dello studente.
     */
    @Override
    public String toString(){
        return  ("matricola:"+matricola+"\n"+ "nome:"+nome+"\n"+ "mediaVoti"+mediaVoti+"\n"+ "isFuoriCorso" + isFuoriCorso +"\n"+ "inizialeCorso:" + inizialeCorso);
    }
}
