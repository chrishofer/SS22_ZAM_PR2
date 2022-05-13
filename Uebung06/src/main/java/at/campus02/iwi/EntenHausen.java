package at.campus02.iwi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntenHausen {
    private List<Ente> enten;
    public EntenHausen() {
        // TODO Auto-generated constructor stub
        enten = new ArrayList<Ente>();
    }
    public void addEnte(Ente e)
    {
        enten.add(e);
    }
    public Map<Integer, List<Ente>> getGruppierteEnte()
    {
        HashMap<Integer, List<Ente>> h = new HashMap<Integer, List<Ente>>();
        ArrayList<Ente> e100, e200, e300;
        e100 = new ArrayList<Ente>();
        e200 = new ArrayList<Ente>();
        e300 = new ArrayList<Ente>();

        for(Ente e : enten)
        {
            if(e.getFullWeight() <= 100)
            {
                e100.add(e);
            }
            else
            {
                if(e.getFullWeight() <= 200)
                {
                    e200.add(e);
                }
                else
                {
                    e300.add(e);
                }
            }
        }
        h.put(100, e100);
        h.put(200, e200);
        h.put(300, e300);
        return h;

    }
}
