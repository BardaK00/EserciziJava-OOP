public interface Vagone extends Comparable<Vagone>{
    Identificatore identificatore();
    Lunghezza lunghezza();
    Massa massa();
    Massa massaFrenata();
    Velocità velocità();

    default int compareTo(Vagone v){
        String s1 = this.identificatore().identificatore();
        String s2 = v.identificatore().identificatore();
        return s1.compareTo(s2);
   }

}
