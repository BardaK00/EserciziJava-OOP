package studenti;
import corsi.*;

public interface Valutabile {
    void assegnaVoto(int voto);
    int getVoto(Corso C);
}
