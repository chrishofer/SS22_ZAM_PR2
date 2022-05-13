package at.campus02.iwi;

public class Frog extends Animal {
    public Frog(String color, int countEyes)
    {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Jumping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Quack quack");
    }
}