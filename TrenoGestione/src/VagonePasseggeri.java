public class VagonePasseggeri implements Vagone{
    private Identificatore identificatore;
    private Lunghezza lunghezza;
    private Massa massa;
    private Massa massaFrenata;
    private Velocità velocità;


    public VagonePasseggeri(Identificatore identificatore, Velocità velocità, Massa massaFrenata, Massa massa, Lunghezza lunghezza) {
        this.identificatore = identificatore;
        this.velocità = velocità;
        this.massaFrenata = massaFrenata;
        this.massa = massa;
        this.lunghezza = lunghezza;
    }

    @Override
    public Identificatore identificatore() {
        return this.identificatore;
    }

    @Override
    public Lunghezza lunghezza() {
        return this.lunghezza;
    }

    @Override
    public Massa massa() {
        return this.massa;
    }

    @Override
    public Massa massaFrenata() {
        return this.massaFrenata;
    }

    @Override
    public Velocità velocità() {
        return this.velocità;
    }
}
