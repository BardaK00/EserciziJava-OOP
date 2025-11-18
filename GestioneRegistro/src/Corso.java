import java.util.*;
public class Corso {
    private Map<Integer,Studente> listaStudenti = new TreeMap<Integer,Studente>();

    public Corso(){}

    public Corso(TreeMap<Integer,Studente> a){
        listaStudenti = a;

    }

    public Map<Integer,Studente>getListaStudenti(){
        return listaStudenti;

    }

    public String printaOrdinato(){
        var sb = new StringBuilder();
        for(var s:listaStudenti.entrySet()){
            sb.append(s.getValue());
            sb.append("\n");
            sb.append(s.getKey());
            sb.append("\n\n");

        }
        return sb.toString();
    }

    public String calcolaMediaStudenti(){
        var sb = new StringBuilder();
        for (var entry:listaStudenti.entrySet()){
            sb.append("lo studente:"+entry.getKey()+"ha media:");
            sb.append(entry.getValue().mediaVoti());
            sb.append("\n");

        }
        return sb.toString();
    }
}
