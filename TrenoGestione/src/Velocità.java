public record Velocità(double velocità) {
    public Velocità{
        if (velocità<0)throw new IllegalArgumentException("la velocità non può essere negativaß");
    }
}
