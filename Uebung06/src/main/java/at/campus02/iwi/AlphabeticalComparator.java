package at.campus02.iwi;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind o1, Kind o2) {
        String o1Name = o1.getZname() + " " + o1.getVname();
        String o2Name = o2.getZname() + " " + o2.getVname();

        return o1Name.compareTo(o2Name);
    }
}
