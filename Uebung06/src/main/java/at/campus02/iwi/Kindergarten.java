package at.campus02.iwi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kindergarten {
    private String klasse;
    private List<Kind> kinder;

    public Kindergarten(String klassenName) {
        klasse = klassenName;
        kinder = new ArrayList<Kind>();
    }

    public void sortAlphabetical()
    {
        Collections.sort(kinder, new AlphabeticalComparator());
    }
    public void sortAge()
    {
        Collections.sort(kinder, new AgeComparator());

    }

    public void addKind(Kind k)
    {
        kinder.add(k);
    }
    /**
     * @return the klasse
     */
    public String getKlasse() {
        return klasse;
    }
    /**
     * @return the kinder
     */
    public List<Kind> getKinder() {
        return kinder;
    }


}
