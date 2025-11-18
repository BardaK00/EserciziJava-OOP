public record Trazione (Massa trazione,String descrizione) {
    public Trazione{
        if (trazione.massa()<0) throw new IllegalArgumentException("la trazione non può essere negativa");
    }
}
