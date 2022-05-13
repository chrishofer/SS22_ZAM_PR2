package at.campus02.iwi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {
    private Map<RoomType, List<Room>> rooms;

    public House() {
        rooms = new HashMap<RoomType, List<Room>>();
    }
    public void addRoom(Room room)
    {
        RoomType r = room.getType();
        List<Room> l = rooms.get(r);
        if(l == null)
        {
            // first element
            l = new ArrayList<Room>();
            l.add(room);
            rooms.put(r, l);

        }
        else
        {
            l.add(room);
        }
    }
    public double getWindowAreaFacingOrientation(Orientation o)
    {
        double area = 0;

        for(RoomType rt : rooms.keySet())
        {
            List<Room> rList = rooms.get(rt);

            for(Room r : rList)
            {
                List<RoomOpening> opL = r.getOpenings().get(o);
                if(opL != null)
                {
                    for(RoomOpening op : opL)
                    {
                        if(op instanceof Window)
                        {
                            area += op.getHeight() * op.getWidth();
                        }
                    }
                }
            }

        }

        return area;
    }
    public int getNumberOfOpeningsInRoomType(RoomType r)
    {
        int nrOpenings = 0;

        List<Room> rl = rooms.get(r);

        if(rl != null )
        {
            for(Room room : rl)
            {
                for(Orientation or : room.getOpenings().keySet())
                {
                    nrOpenings += room.getOpenings().get(or).size();
                }

            }
        }

        return nrOpenings;
    }
    public List<Room> getAllConnectedRooms(Room r)
    {
        List<Room> rooms = new ArrayList<Room>();


        //Map<Orientation, List<RoomOpening>>

        for(Orientation orient : r.getOpenings().keySet())
        {
            List<RoomOpening> l = r.getOpenings().get(orient);
            if(l != null)
            {
                for(RoomOpening o : l)
                {
                    if(o.getClass().equals(Door.class))
                    {
                        Door d = (Door)o;
                        if(d.getRoom1() != r)
                        {
                            rooms.add(d.getRoom1());
                        }
                        if(d.getRoom2() != r)
                        {
                            rooms.add(d.getRoom2());
                        }
                    }
                }
            }
        }

        return rooms;
    }

}
