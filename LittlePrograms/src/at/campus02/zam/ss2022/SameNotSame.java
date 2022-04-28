package at.campus02.zam.ss2022;

import java.util.ArrayList;
import java.util.List;

public class SameNotSame {
    public static void main(String[] args) {
        // we want to find out which class an object is
        // there are two different ways
        // (if possible don't use them at all -> use poloymorphism -> base class
        // (with the same methods)

        // situation 1: check if obj of a class is exactly this class
        // (maybe less useful than the other one)
        Beagle b = new Beagle("Doggo", "black",
                    17, true, "Spaghetti");
        // here it is less fun because we really know what is on it

        System.out.println(b.getClass());
        System.out.println(Beagle.class);

        if(b.getClass().equals(Beagle.class)){
            System.out.println("The same");

        }
        Object obj = b;
        System.out.println(obj.getClass());
        if(obj.getClass().equals(Beagle.class)){
            // now i know for sure that there is a Beagle on the reference
            // now i can make a downcast and there won't be an error
            Beagle b2 = (Beagle)obj;
            // now i can execute bagle methods
        }

        // situation 2: var instanceof Classname
        // here we war not interested in the exact type but if it is able to
        // do all necessary stuff (this means i am the correct class, or a subclass, or
        // an interface implementing class)

        if(b instanceof Beagle){
            System.out.println("yep");
        }
        if(b instanceof Dog){
            System.out.println("yep");
        }
        if(obj instanceof Dog){
            System.out.println("yep");
        }
        // now we could get check all kind of subclases of animals and save them as an
        // animal reference and execute animal methods

        List<Dog> meineListe = new ArrayList<>();

    }
}
