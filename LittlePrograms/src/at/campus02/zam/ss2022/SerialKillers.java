package at.campus02.zam.ss2022;

import java.util.HashSet;

public class SerialKillers {

    // als angehende*r neuer serienkiller*in (damit sind keine bösartigen personen gemeint sondern personen
    // die sehr gerne und sehr viele serien schauen) möchten sie auch wirklich in die Geschichtsbücher
    // eingehen und deshalb wollen wir sicherstellen, dass ihr neuer name auch wirklich eindeutig ist
    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");

        for(String s : serialNicknames){
            System.out.println(s);
        }
        System.out.println(serialNicknames.add("Ted Bundy"));
        System.out.println(serialNicknames.add("Edmund Kemper"));
        System.out.println(serialNicknames.add("Jack the Ripper"));
        for(String s : serialNicknames){
            System.out.println(s);
        }
        //serialNicknames.retain
        // zweites set nur für amerikaner*innen
        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Edmund Kemper");
        americanSerialKiller.add("Hannibal Lecter");
        serialNicknames.retainAll(americanSerialKiller);
        System.out.println("----");
        for(String s : serialNicknames){
            System.out.println(s);
        }
        for(String s : americanSerialKiller){
            System.out.println(s);
        }
    }
}
