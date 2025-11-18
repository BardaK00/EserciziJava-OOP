package Gestionale;

public record Orario(Giorno giornoSettimana,int ora,int minuti){
        public enum Giorno{
            LUNEDI,MARTEDI,MERCOLEDI,GIOVEDI,VENERDI,SABATO
        }

    public Orario{
        if (ora <0 || ora>=23)throw new IllegalArgumentException();
        if (minuti != 00 && minuti!=15 && minuti!=30 && minuti!=45) throw new IllegalArgumentException();
        }

}
