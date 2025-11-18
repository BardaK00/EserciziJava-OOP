package Gestionale;

public record CodiceCorso(String codice){
    public CodiceCorso{
        if (codice.length()!= 7) throw new IllegalArgumentException();

        for(int i = 0; i<codice.length();i++){
            // verifica che i primi 2 caratteri non siano lettere
            if(i<2 && !(Character.isLetter(codice.charAt(i))))throw new IllegalArgumentException();

            //verifica che il terzo carattere non sia diverso da "-"
            if (!(codice.charAt(i) == (char)'-') && i==2) throw new IllegalArgumentException();

            //verifica che i successivi 3 caratteri siano numeri
            if (i>2 && i<codice.length()-1 && !(Character.isDigit(codice.charAt(i))))throw new IllegalArgumentException();

            //verifica che l'ultimo carattere sia una lettera
            if(i==codice.length()-1 && !(Character.isLetter(codice.charAt(i))))throw new IllegalArgumentException();
        }

    }
}
