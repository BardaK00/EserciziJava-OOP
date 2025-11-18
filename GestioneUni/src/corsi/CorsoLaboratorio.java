package corsi;

public class CorsoLaboratorio implements Corso {

    private int codiceCorso;
    private String titolo;
    private String docente;
    private int oreLaboratorio;

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
        return oreLaboratorio;
    }
    @Override
    public int calcolaCrediti() {
        return this.getOre()/5;
    }
}


