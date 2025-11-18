public record Lunghezza(double lunghezza) {
    public Lunghezza{
        if(lunghezza < 5 || lunghezza >35 ) throw new IllegalArgumentException("lunghezza non consentita");
    }
}
