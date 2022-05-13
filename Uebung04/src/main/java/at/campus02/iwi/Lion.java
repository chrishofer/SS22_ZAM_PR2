package at.campus02.iwi;

public class Lion extends Animal {
    public Lion(String color, int countEyes)
    {
        super(color, countEyes);
    }
    @Override
    public void walk() {

        System.out.println("Running like a lion king");
    }

    @Override
    public void makeNoise() {
        System.out.println("cough cough");
    }


    public void roar( ) {
        System.out.println("roooooooaaaarrrrrrrrrr");
    }
}