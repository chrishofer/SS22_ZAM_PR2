package at.campus02.iwi;

public class BadeEnte extends Ente{
    protected int gewichtWasser;
    public BadeEnte(String n, int g, int gW) {
        super(n, g);
        gewichtWasser = gW;
    }
    @Override
    public int getFullWeight() {
        return gewicht + gewichtWasser;
    }
    @Override
    public String makeNoise() {
        return "Quietsch " + name + " " + getFullWeight();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return makeNoise();
    }
}
