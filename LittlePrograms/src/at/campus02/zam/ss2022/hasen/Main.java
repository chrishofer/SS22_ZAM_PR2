package at.campus02.zam.ss2022.hasen;

public class Main {
    public static void main(String[] args) {
        Osterhase oster = new Osterhase("Bugs");
        Weihnachtshase weihnachshase = new Weihnachtshase("Snowi");

        oster.hoppeln();
        weihnachshase.hoppeln();

        // let's try up- and downcasting

        //upcasting osterhase to hase -> specialized type to general type is possible
        Hase hase1 = oster;
        hase1.hoppeln(); // osterhase implementation is used
        // it only offers the methods of the hase class not the oserthase class
        // (we do not know any longer the specific osterhasen methods (via the hasen reference))

        // if we know that there is a really a osterhase behind -> downcasten
        Osterhase oster2 = (Osterhase) hase1; //downcasting works
        oster2.versteckeOstereier();

        // but not always - a weihnachtshase cannot be a osterhase caue they are missing
        // attributes and methods of an Osterhase
        //oster2 = (Osterhase)weihnachshase;

        Hasenstall hs = new Hasenstall();
        hs.addHase(oster);
        hs.addHase(weihnachshase);

        hs.hoppelAll();



        // try around with up and downcasting
        Osterhase o1 = new Osterhase("Mrs. Egg");
        Osterhase o2 = o1;
        Hase h1 = new Hase("Common rabbit (but cute)");
        Weihnachtshase w2 = new Weihnachtshase("Mr. Snow");


        Hase h4 = new Osterhase("Bunny");



        Weihnachtshase wh;
        Osterhase oh;
        Hase h;

        // vererbungshierarchie
        //                   |--->  Osterhase
        // Object --> Hase ---
        //                   |--->  Weihnachtshase

        // upcasting: assigning a child class to a reference of its partent class
        // example:
        // THIS IS UPCASTING
        h = o1;  // assign from right (child class Osterhase) to left (parent class Hase)
        // what is the difference if i acces now my Mrs. Egg via the h Hase referernce
        // -> the versteckeOstereier is missing because we only see attributes and methods
        // already the Hase has (imagine: we view the Osterhase Mrs. Egg through the lens of a Hase)
        // BUT THE NICE THING IS: if we call a method already known to the Hase then the correc implementaion
        // (the nearest one) is executed -> so in our case the implementation of the Osterhase
        h.hoppeln();


        // why do make this? -> because of poloymorphism (think about arraylist)

        // now what is DOWN CASTING?
        // assigning a general type to a more specialized type (ATTENTION - ALARM SIGNAL)
        // this only works if this general reference already refers to a specialized object instance
        //wh = (Weihnachtshase) h1; // this gives us a ClassCastException
        // but there are special cases when down casting works (i will have to upcast before)
        h = w2; // this happened somewhere before (could be years)

        // but we know that behind this hase reference is really a Weihnachtshase
        // (we know it from somewhere - next time we will also learn how to check)
        wh = (Weihnachtshase) h;
        h.hoppeln();
        wh.hoppeln();

    }
}
