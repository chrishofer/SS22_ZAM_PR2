package at.campus02.iwi;

public class Dog extends Animal {
    protected String name;
    public Dog(String color, int countEyes, String name)
    {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Running and panting");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " makes wuff wuff");
    }
}