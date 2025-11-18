public record Massa(int massa, int massaFrenata) {
    public Massa{
        if(massa < 1 || massa > 250) throw new IllegalArgumentException("massa non corretta");
        if (massaFrenata <= 0 || massaFrenata>massa)throw new IllegalArgumentException("massaFrenata non corretta");
    }

}
