import java.util.*;
public class Studente {
    private int matricola;
    private Map<String,Double> listaVoti = new HashMap<>();

    enum StatoStudente{
        ATTIVO,SOSPESO,RITIRATO;

        private int stato;

        public int getStatoStudente(){
            return stato;

        }


    }

    public int getMatricola(){
        return matricola;
    }

    public Map<String,Double>  getVoti(){
        return listaVoti;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //entrySet() trasforma tutti gli elementi nell'hash map i coppie di valori iterabili
        for (var entry : listaVoti.entrySet()) {

            //la funzione getKey restituisce la chiave della coppia entry in questo caso
            sb.append(entry.getKey())
                    .append(": ")

                    //getValue restituisce il valore associato ad entry
                    .append(entry.getValue())
                    .append("\n"); // Adds a new line after every entry
        }
        return sb.toString();
    }

    //funzione che calcola la media dei voti per ogni studente
    public double mediaVoti(){
        double sum = 0;
        int cont = 0;
        for(var entry:listaVoti.entrySet()){
            sum += entry.getValue();
            cont ++;
        }
        return sum/cont;
    }


}
