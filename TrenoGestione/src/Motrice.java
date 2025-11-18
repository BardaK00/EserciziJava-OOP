import java.util.Objects;

public class Motrice {
    private Trazione trazione;

    public Motrice(Trazione trazione) {
        this.trazione = trazione;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Motrice motrice)) return false;
        return Objects.equals(trazione, motrice.trazione);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(trazione);
    }

    public Trazione getTrazione() {
        return trazione;
    }
}
