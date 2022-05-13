package at.campus02.iwi;

public class EventApp {
    public static void main(String[] args) {
        EventKalender kalendar = new EventKalender();

        kalendar.add(new Event("Konzert 1", "Wien", 100));
        kalendar.add(new Event("Konzert 2", "Wien", 120));
        kalendar.add(new Event("Konzert 3", "Graz", 130));
        kalendar.add(new Event("Konzert 4", "Graz", 140));

        System.out.println("--------------");
        System.out.println(kalendar.getByTitle("Konzert 3"));
        System.out.println("--------------");
        System.out.println(kalendar.getByOrt("Wien"));
        System.out.println("--------------");
        System.out.println(kalendar.getByEintrittsPreis(120, 130));
        System.out.println("--------------");
        System.out.println(kalendar.getMostExpensiveByOrt("Wien"));
        System.out.println("--------------");
        System.out.println(kalendar.getAvgPreisByOrt("Graz"));
        System.out.println("--------------");
        System.out.println(kalendar.getCountEventsByOrt());
        System.out.println("--------------");
        System.out.println(kalendar.getSumPriceEventsByOrt());
    }
}
