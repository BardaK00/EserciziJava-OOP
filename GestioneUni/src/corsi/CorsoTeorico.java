package corsi;

public class CorsoTeorico implements Corso {
    private int codiceCorso;
    private String titolo;
    private String docente;
    private int oreLezioni;

    @Override
    public int getCodice() {
        return codiceCorso;
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    @Override
    public String getDocente() {
        return docente;
    }

    public int getOre(){
        return oreLezioni;
    }
    @Override
    public int calcolaCrediti() {
        return this.getOre()/10;
    }
}
