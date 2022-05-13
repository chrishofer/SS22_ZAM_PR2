package at.campus02.zam.ss2022.sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortierApp {
    public static void main(String[] args) {
        int [] intArr = {27, -12, 4, 29, 34};
        String [] strArr = {"Hansis Erste Hits", "Hansis Beste", "Hansis Neuestes Album"};
        Mitarbeiter [] mrArr = {new Mitarbeiter("Hansi", "Hinterseer", 1954),
                                new Mitarbeiter("Sonja", "Sonnenblume", 1970),
                                new Mitarbeiter("Helena", "Fischer", 1980)};
        //Arrays.asList() to convert array to list
        List<Mitarbeiter> mrList = new ArrayList<Mitarbeiter>();
        mrList.add(new Mitarbeiter("Hansi", "Hinterseer", 1954));
        mrList.add(new Mitarbeiter("Sonja", "Sonnenblume", 1970));
        mrList.add(new Mitarbeiter("Helena", "Fischer", 1980));


        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        // sortieren auch komplexen datentyp
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));


        System.out.println(Arrays.toString(mrArr));
        Arrays.sort(mrArr); // error because we do not implement comparable interface
        System.out.println(Arrays.toString(mrArr));

        System.out.println(mrList);
        Collections.sort(mrList);
        System.out.println(mrList);

        // now with comparator
        Collections.sort(mrList, new ZunameComparator());
        System.out.println(mrList);
    }
}
