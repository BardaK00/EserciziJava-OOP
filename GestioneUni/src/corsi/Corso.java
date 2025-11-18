package corsi;

public interface Corso {
    /*Ogni corso ha un codice identificativo, un titolo e un docente responsabile.I corsi possono
    essere di due tipi:
    CorsoTeorico, caratterizzato dal numero di lezioni previste;
    CorsoLaboratorio, caratterizzato invece dalle ore di esercitazione pratica.
    Entrambi i corsi derivano da una classe base astratta Corso, che definisce gli
    attributi comuni e un metodo astratto calcolaCrediti(), implementato diversamente
    nelle due sottoclassi.
    Ad esempio, un corso teorico potrebbe assegnare 1 credito ogni 10 lezioni,
    mentre un corso di laboratorio 1 credito ogni 5 ore di laboratorio.
    */

    int getCodice();
    String getTitolo();
    String getDocente();
    int calcolaCrediti();

}

