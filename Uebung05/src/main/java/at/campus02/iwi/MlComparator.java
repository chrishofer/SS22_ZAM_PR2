package at.campus02.iwi;

import java.util.Comparator;

public class MlComparator implements Comparator<Getraenk> {
    public int compare(Getraenk o1, Getraenk o2) {
        return Double.compare(o1.mengeInMl(), o2.mengeInMl());
    };
}