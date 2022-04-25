package at.campus02.zam.ss2022.hasen;

public class Main {
    public static void main(String[] args) {
        Osterhase oster = new Osterhase("Bugs");
        Weihnachshase weihnachshase = new Weihnachshase("Snowi");

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

    }
}
