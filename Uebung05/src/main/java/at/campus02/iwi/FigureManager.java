package at.campus02.iwi;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    protected ArrayList<Figure> list;

    public FigureManager() {
        list = new ArrayList<Figure>();

    }
    public void add(Figure f)
    {
        list.add(f);
    }
    public double getMaxPerimeter()
    {
        double highest = -1;

        for(Figure f : list)
        {
            double help = f.getPerimeter();

            if(help > highest)
            {
                highest = help;
            }
        }
        return highest;
    }
    public double getAverageAreaSize()
    {
        double avg = 0;

        for(Figure f : list)
        {
            avg += f.getArea();
        }
        avg = avg / list.size();
        return avg;
    }
    public HashMap<String, Double> getAreaBySizeCategories()
    {
        HashMap<String, Double> mapchen = new HashMap<String, Double>();

        double klein = 0, mittel = 0, gross = 0;

        for(Figure f : list)
        {
            double area = f.getArea();
            if(area < 1000)
            {
                klein += area;
            }
            else
            {
                if(area >= 5000)
                {
                    gross += area;
                }
                else
                {
                    mittel += area;
                }
            }
        }
        mapchen.put("Klein", klein);
        mapchen.put("Mittel", mittel);
        mapchen.put("Gross", gross);
        return mapchen;
    }
}