package at.campus02.iwi;

public abstract class Ente implements Comparable<Ente> {
    protected String name;
    protected int gewicht;
    public Ente(String n, int g) {
        name = n;
        gewicht = g;
    }
    public abstract int getFullWeight();
    public abstract String makeNoise();

    @Override
    public int compareTo(Ente o) {
        return Integer.compare(getFullWeight(), o.getFullWeight());
    }
}
