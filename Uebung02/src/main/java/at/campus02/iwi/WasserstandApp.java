package at.campus02.iwi;

public class WasserstandApp {
    public static void main(String[] args) {
        WasserstandManager wm = new WasserstandManager();

        wm.add(new Wasserstand(1, "Drau", "Klagenfurt" , 5, 7, 10000));
        wm.add(new Wasserstand(2, "Drau", "Klagenfurt" , 8, 7, 10003));
        wm.add(new Wasserstand(3, "Drau", "Klagenfurt" , 5, 7, 122200));
        wm.add(new Wasserstand(5, "Drau", "Villach" , 5, 7, 122201));
        wm.add(new Wasserstand(4, "Donau", "Wien" , 5, 7, 122200));
        wm.add(new Wasserstand(6, "Donau", "Dürntstein" , 9, 7, 122200));

        System.out.println(wm.findById(1));
        System.out.println("-----------");
        System.out.println(wm.findAllByGewaesser("Drau"));
        System.out.println("-----------");
        System.out.println(wm.findLastWasserstand("Drau"));
        System.out.println("-----------");
        System.out.println(wm.findForAlarmierung());
        System.out.println("-----------");
        System.out.println(wm.calcMittlererWasserstand("Drau",  "Klagenfurt"));
        System.out.println("-----------");
        System.out.println(wm.findByZeitpunkt(9000, 11000, "Drau", "Klagenfurt"));
        System.out.println("-----------");
    }
}
