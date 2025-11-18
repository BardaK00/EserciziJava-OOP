package studenti;
import corsi.*;

public class Studente implements Valutabile{
    private int matricola;
    private String nome;
    private String Cognome;

    private Corso[] listaCorsi = new Corso[15];
    private int[] listaVoti = new int[15];

    public int getMatricola() {
        return matricola;
    }

    public int[] getListaVoti() {
        return listaVoti;
    }

    public Corso[] getListaCorsi() {
        return listaCorsi;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getNome() {
        return nome;
    }

    public void aggiungiCorso(Corso c){
        Corso []listaC = this.getListaCorsi();
        for (int i=0;i<listaC.length;i++){
            if (listaC[i] == null){
                listaC[i] = c;
                this.listaCorsi = listaC;
                return;
            }
        }
    }

    @Override
    public void assegnaVoto(int voto) {
        Corso[] lCorso = this.getListaCorsi();
        for (int i = 0; i < lCorso.length; i++) {
            if (lCorso[i] == null) {
                int votoIndex = i - 1;

                if (votoIndex < 0) throw new ArrayIndexOutOfBoundsException();

                else {
                    int[] lVotiAggiornato = this.getListaVoti();
                    lVotiAggiornato[votoIndex] = voto;
                    this.listaVoti = lVotiAggiornato;
                }
            } else {
                int[] lVotiAggiornato = this.getListaVoti();
                lVotiAggiornato[0] = voto;
                this.listaVoti = lVotiAggiornato;
            }
        }
    }

    @Override
    public int getVoto(Corso C) {
        int codCorso = C.getCodice();
        Corso []listaC = this.getListaCorsi();
        int index = 0-1;
        for(int i = 0; i<listaC.length;i++){
            if (listaC[i] == null){
                continue;
            }
            if (listaC[i].getCodice() == codCorso) {
                index = i;
                break;
            }

        }
        if(index == -1){
            System.out.printf("corso non trovato");
            return -1;
        }
        int[]listaV = this.getListaVoti();
        return listaV[index];
    }

    public double calcolaMedia(){
        double sum = 0;
        int cont = 0;
        for(int voto:this.getListaVoti()){
            sum+= voto;
            cont ++;
        }
        if (cont == 0){
            System.out.printf("non ci sono voti per questo studente");
            return 0;
        }
        return sum / cont;
    }
}
