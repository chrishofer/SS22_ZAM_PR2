package at.campus02.iwi;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ententeich {

    public static void main(String[] args) {
        EntenHausen e = new EntenHausen();
        e.addEnte(new BadeEnte("Daisy", 100, 20));
        e.addEnte(new BadeEnte("Donald", 100, 15));
        e.addEnte(new FlugEnte("Tick", 40, 20));
        e.addEnte(new FlugEnte("Trick", 20, 20));
        e.addEnte(new FlugEnte("Track", 40, 25));

        Map<Integer, List<Ente>> h = e.getGruppierteEnte();

        for(Integer i : h.keySet())
        {
            System.out.println(i);

            System.out.println(h.get(i));

            Collections.sort(h.get(i));

            System.out.println(h.get(i));
        }
    }
}