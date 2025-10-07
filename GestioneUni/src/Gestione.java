import corsi.*;
import studenti.*;
public class Gestione {
    private Studente[] listaStudenti;
    private Corso[] listaCorsi;

    /*fornire metodi per iscrivere studenti ai corsi,
    assegnare voti,
    stampare informazioni e statistiche globali.*/

    public Gestione(int nStudenti,int nCorsi){
        listaStudenti = new Studente[nStudenti];
        listaCorsi = new Corso[nCorsi];
    }

    public Studente[] getStudenti(){
        return this.listaStudenti;
    }
    public Corso[] getCorsi(){
        return this.listaCorsi;
    }

    public void aggiungiCorso(Corso c){
        Corso[]listaCor = this.getCorsi();
        for (int i=0;i<listaCor.length;i++){
            if (listaCor[i]==null){
                listaCor[i] = c;
                this.listaCorsi = listaCor;
                System.out.printf("Corso aggiunto al database con successo");
                return;
            }
        }
    }

    public void aggiungiStudente(Studente s){
        Studente[]listaStu = this.getStudenti();
        for (int i=0;i<listaStu.length;i++){
            if (listaStu[i]==null){
                listaStu[i] = s;
                this.listaStudenti=listaStu ;
                System.out.printf("Studente aggiunto al database con successo");
                return;
            }
        }
    }






    private boolean checkStudente(Studente s) {

        Studente[] listaStud = this.getStudenti();
        for (int i = 0; i < listaStud.length; i++) {
            if (listaStud[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCorso(Corso c) {
        Corso[] listaCor= this.getCorsi();
        for (int i = 0; i < listaCor.length; i++) {
            if (listaCor[i].equals(c)) {
                return true;
            }
        }
        return false;
    }

    public void iscriviStudenteA(Studente s, Corso c) {
        if (this.checkStudente(s) && this.checkCorso(c)){
            s.aggiungiCorso(c);
        }else{
            System.out.println("corso o studente non trovato");
        }
    }


}


