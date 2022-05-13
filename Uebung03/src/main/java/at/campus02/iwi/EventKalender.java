package at.campus02.iwi;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
    private ArrayList<Event> events;

    public EventKalender() {
        events = new ArrayList<Event>();
    }
    public void add(Event e)
    {
        events.add(e);
    }
    public Event getByTitle(String title)
    {
        for(Event e:events)
        {
            if(e.getTitle().equals(title))
            {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort)
    {
        ArrayList<Event> erg = new ArrayList<Event>();
        for(Event e:events)
        {
            if(e.getOrt().equals(ort))
            {
                erg.add(e);
            }
        }
        return erg;

    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max)
    {
        ArrayList<Event> erg = new ArrayList<Event>();

        for(Event e:events)
        {
            if(e.getEintrittspreis() >= min  && e.getEintrittspreis() <= max)
            {
                erg.add(e);
            }
        }
        return erg;
    }

    public Event getMostExpensiveByOrt(String ort)
    {
        Event erg = null;

        for(Event e:events)
        {
            if(e.getOrt().equals(ort) && (erg == null || e.getEintrittspreis() > erg.getEintrittspreis() ))
            {
                erg = e;
            }
        }

        return erg;
    }
    public double getAvgPreisByOrt(String ort)
    {
        double erg = 0;
        int zaehler = 0;
        for(Event e:events)
        {
            if(e.getOrt().equals(ort))
            {
                erg += e.getEintrittspreis();
                zaehler += 1;
            }
        }


        return erg / zaehler;
    }
    public HashMap<String, Integer> getCountEventsByOrt()
    {
        HashMap<String, Integer> erg = new HashMap<String, Integer>();

        for(Event e : events)
        {
            if(erg.containsKey(e.getOrt()))
            {
                // ort already in hashmap
                erg.put(e.getOrt(), 1 + erg.get(e.getOrt()));
            }
            else
            {
                // ort not in hashmap
                erg.put(e.getOrt(), 1);
            }
        }

        return erg;
    }

    public HashMap<String, Double> getSumPriceEventsByOrt()
    {
        HashMap<String, Double> erg = new HashMap<String, Double>();

        for(Event e : events)
        {
            if(erg.containsKey(e.getOrt()))
            {
                // ort already in hashmap
                erg.put(e.getOrt(), e.getEintrittspreis() + erg.get(e.getOrt()));
            }
            else
            {
                // ort not in hashmap
                erg.put(e.getOrt(), e.getEintrittspreis());
            }
        }

        return erg;
    }

}