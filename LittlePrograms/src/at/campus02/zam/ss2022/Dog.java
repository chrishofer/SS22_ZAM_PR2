package at.campus02.zam.ss2022;

public class Dog {
    public String name;
    public String eyeColor;
    public int weight;
    public boolean appreciatesOtherDogs;

//    public Dog(){
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weight = 17;
//        this.appreciatesOtherDogs = true;
//    }

    public Dog(String name, String eyeColor, int weight, boolean appreciatesOtherDogs){
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.appreciatesOtherDogs = appreciatesOtherDogs;
    }
    public void bark(){
        System.out.println(name + " barks");
    }
    public void eat(){
        System.out.println(name + " eats");
        bark();
    }

    @Override
    public String toString() {
        String text=null;
        if(appreciatesOtherDogs){
            text = name + " admires other dogs with their sparkly " + eyeColor + " eyes";
        }else{
            text = name + " barks until all other dogs leave the party";
        }

        return text;
    }
}
