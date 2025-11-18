package Gestionale;

public record Intensita(int intensita) {
    public Intensita{
        if (intensita<0||intensita>5)throw new IllegalArgumentException();
    }
}
