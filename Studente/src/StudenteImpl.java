public class StudenteImpl implements Studente{
    private int matricola;
    private String nome;
    private double mediaVoti;
    private boolean isFuoriCorso;
    private char inizialeCorso;

    public StudenteImpl(int mat,String name, double media,boolean fuoriC,char corso){
        matricola = mat;
        nome = name;
        mediaVoti=media;
        isFuoriCorso = fuoriC;
        inizialeCorso = corso;

    }
    @Override
    public int getMatricola() {
        return matricola;
    }

    @Override
    public String getNome() {
        return nome;

    }

    @Override
    public double getMediaVoti() {
        return mediaVoti;
    }

    @Override
    public char getInizialeCorso() {
        return inizialeCorso;
    }

    @Override
    public String toString(){
        return  ("matricola:"+matricola+"\n"+ "nome:"+nome+"\n"+ "mediaVoti"+mediaVoti+"\n"+ "isFuoriCorso" + isFuoriCorso +"\n"+ "inizialeCorso:" + inizialeCorso);
    }
}
