public record Identificatore(String identificatore) {

    public Identificatore{
       for (int i= 0;i<identificatore.length();i++){
           char ch = identificatore.charAt(i);
           if (i<3){
               if (!(Character.isLetter(ch))){
                   throw new IllegalArgumentException("Codice non valido");
               }
           else{
               if (!(Character.isDigit(ch))){
                   throw new IllegalArgumentException("Codice non valido");
               }
           }
           }
       }
    }

}
