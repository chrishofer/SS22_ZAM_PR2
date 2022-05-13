package at.campus02.iwi;

import java.util.ArrayList;

public class GetraenkeApp {
    public static void main(String[] args) {
        Registrierkasse k = new Registrierkasse();

        k.verkauft(new SimplesGetraenk("Wasser", new Fluessigkeit("Wasser", 500, 0)));
        k.verkauft(new LongDrink("Cola Whiskey", new Fluessigkeit("Whiskey", 40,  30), new Fluessigkeit("Cola", 300,  0)));
        k.verkauft(new LongDrink("Cola Wodka", new Fluessigkeit("Wodka", 50,  30), new Fluessigkeit("Cola", 300,  0)));
        ArrayList<Fluessigkeit> ct = new ArrayList<Fluessigkeit>();
        ct.add(new Fluessigkeit("Wein", 200,  12));
        ct.add(new Fluessigkeit("Mineralwasser", 200, 0));
        ct.add(new Fluessigkeit("Aperol", 40,  15));
        k.verkauft(new Cocktail("Venezianischer Spritzer", ct));

        k.printGetraenkeSortiertNachAnzahlZutaten();

        k.printGetraenkeSortiertNachMl();


        System.out.println(k.getGetraenkeAufgeteiltNachZutaten());

    }
}
