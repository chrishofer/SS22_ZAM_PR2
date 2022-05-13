package at.campus02.iwi;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind o1, Kind o2) {

//		if (o1.getAge() < o2.getAge())
//		{
//			return -1;
//		}
//		if (o1.getAge() > o2.getAge())
//		{
//			return 1;
//		}
//		return 0;

        // variante 2 ueber statische methode in wrapper klasse
        return Integer.compare(o1.getAge(), o2.getAge());
        // variante 3 verwendet compareto von wrapper klasse
//		return ((Integer)o1.getAge()).compareTo(o2.getAge());

    }
}
