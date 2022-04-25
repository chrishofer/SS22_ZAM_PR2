package at.campus02.zam.ss2022;

public class Beagle extends Dog {

    public String lovedFood;

    // situation when we have default constructor Dog()
    // Dog() constructor is called automatically
    // we did not care about the dog inside our beagle :(
    // therefore the default constructor of the Dog is called
    // Dog() -> this Dog() constructor is called at the beginning
    // of the Beagle constructor (imagine in the first line)
    // we could do this also explicitly by
    //super(); // calling parent constructor (is done automatically)

    // situation when we have no default constructor (-> means every constructor has at least parameter)
    // we have to explicitly call the constructor with super
    public Beagle(String name, String eyeColor, int weight, boolean appreciatesOtherDogs, String lovedFood){
        super(name, eyeColor, weight, appreciatesOtherDogs);

        this.lovedFood = lovedFood;
    }

    // here i can overwrite (überschreiben) my method and to my own implementation instead
    // and not the one from one of my base classes


    @Override
    public void bark() {
        //eat(); // we know that we can easily call other methods
        super.bark(); // we use super to reference implementation in the parent class
        super.bark();
    }
}
