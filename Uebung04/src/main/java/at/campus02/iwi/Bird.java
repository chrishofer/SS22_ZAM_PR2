package at.campus02.iwi;

public class Bird extends Animal implements Fly{
    public Bird(String colour){
        super(colour, 2); // i assume every bird has 2 eyes, therefore no parameter
    }


    @Override
    public void walk() {
        System.out.println("running around like a little bird");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void fly() {
        System.out.println("Fly through the sky");
    }
}
