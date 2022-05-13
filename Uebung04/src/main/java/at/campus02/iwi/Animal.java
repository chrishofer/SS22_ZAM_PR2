package at.campus02.iwi;

public abstract class Animal {
    protected String color;
    protected int countEyes;
    public Animal(String color, int counteyes) {
        this.color = color;
        this.countEyes = counteyes;
    }
    public void winkeWinke(){
        System.out.println("Winke winke - waves around");
    }
    public abstract void walk();

    public abstract void makeNoise();

}