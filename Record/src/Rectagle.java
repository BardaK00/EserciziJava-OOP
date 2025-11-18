public record Rectagle(int base, int altezza) implements Comparable<Rectagle>{

    //funge da precostruttore in cui è possibile aggiungere controlli extra prima di chiamare
    // in modo sotto inteso il costruttore

    public Rectagle{
        if (base<=0 || altezza <=0)throw new IllegalArgumentException();
    }
    public int area(){
        return base*altezza;
    }

    public static void main(String[] args){
        Rectagle r = new Rectagle(10,10);
        System.out.println(r.base());
        System.out.println(r.altezza());
    }

    @Override
    public int compareTo(Rectagle o) {
        // supponendo che si possano comparare per le altezze, se sono uguali la sottazione darà 0
        // e quindi non uguali e così se maggiore o minore
        return altezza-o.altezza;
    }
}
