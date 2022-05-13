package at.campus02.iwi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    private RoomType type;
    private double area;

    private Map<Orientation, List<RoomOpening>> openings;

    public Room(RoomType t, double area) {
        type = t;
        this.area = area;
        openings = new HashMap<Orientation, List<RoomOpening>>();
    }

    public void addOpening(Orientation or, RoomOpening o)
    {
        List<RoomOpening> l = openings.get(or);
        if(l == null)
        {
            // first element
            l = new ArrayList<RoomOpening>();
            l.add(o);
            openings.put(or, l);

        }
        else
        {
            l.add(o);
        }
    }


    public RoomType getType() {
        return type;
    }


    public double getArea() {
        return area;
    }


    public Map<Orientation, List<RoomOpening>> getOpenings() {
        return openings;
    }
    @Override
    public String toString() {

        return type + " " + area																																					;
    }

}