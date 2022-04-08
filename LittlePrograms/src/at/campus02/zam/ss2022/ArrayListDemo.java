package at.campus02.zam.ss2022;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Osterhase> mauritius = new ArrayList<>(); // meine erste collection lebt

        Osterhase karl = new Osterhase("Karl von Karlingen", 1000, HasenReligion.EXTRA_BUNTE_OSTEREIER);
        Osterhase karla = new Osterhase("Karla Kolumna", 111, HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase uschi = new Osterhase("Uschi mit den langen Ohren", 7777, HasenReligion.LANGE_OHREN_ZEUGEN);

        // fuegen hinten elemente hinzu
        mauritius.add(karl);
        mauritius.add(karla);
        mauritius.add(uschi);

        // alle durchlaufen
        for(int h = 0; h < mauritius.size(); ++h){
            System.out.println(mauritius.get(h));
        }


        // an welcher stelle ist die karla?
        System.out.println(mauritius.indexOf(karla));


        // verwenden wir doch mal einen Iterator um über unsere Struktur zu iterieren
        Iterator<Osterhase> iter = mauritius.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("*#*#*#*");


        // karl redet ganzen tag nur von der jagd - wird von der insel gejagt
        // (entfernen objekt aus collection)
        mauritius.remove(karl);

        // ist der karl wirklich weg?
        // for each loop: rechts die collection über die wir laufen wollen und von der wir jedes element
        // haben möchten
        // links eine neue hilfsvariable, auf die das jeweils nächste element gelegt wird
        for(Osterhase oh : mauritius){
            System.out.println(oh);
        }

    }
}
