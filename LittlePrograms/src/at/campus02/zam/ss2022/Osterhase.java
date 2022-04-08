package at.campus02.zam.ss2022;

public class Osterhase {
    private static int haeschenZaehler = 1;
    private String name;
    private int anzahlVersteckteEier;
    private int haeschenNummer;
    private HasenReligion persoenlicherGlaube;

    public Osterhase(String name,int anzahlVersteckteEier, HasenReligion glaube){
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
        haeschenNummer = haeschenZaehler++; // jeder osterhase soll ein eigene eindeutige nummer haben
        persoenlicherGlaube = glaube;
        // (wegen der steuer)
        // alternativer zugriff oder von außen (wenns nicht privat wäre)
        // Osterhase.haeschenZaehler
    }


    public Osterhase(String name){
        this.name = name;
        this.anzahlVersteckteEier = 0;
        haeschenNummer = haeschenZaehler++;
        persoenlicherGlaube = HasenReligion.LANGE_OHREN_ZEUGEN;
    }
    public int getHaeschenNummer() {
        return haeschenNummer;
    }

    @Override
    public String toString() {
        return name + " versteckte " + anzahlVersteckteEier + " Eier und glaubt an: " + persoenlicherGlaube;
    }

    //    public void aendereAnzahlEier(int anzahlVersteckteEier){
//        // ich kann sicherstellen, dass kein blödsinn gemacht wird
//        if(anzahlVersteckteEier >= 0) {
//
//            // lokale variablen oder parameter mit gleichem namen werden bevorzugt
//            // anzahlVersteckteEier --> parameter
//            // this referenz zeigt auf die aktuelle instanz
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//    }
//    // methoden überladen - unterscheidet sich durch typ/anzahl der parameter
//    // hier haben wir eine ohne Parameter -> dann soll Osterhase ein Dutzend Eier verstecken
//    public void aendereAnzahlEier(){
//        anzahlVersteckteEier = 12;
//        // this.anzahl... wäre möglich aber nicht notwendig, da keine namensgleichheit
//    }

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if(anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public int gibMirAnzahlDerVerstecktenEier(){
//        return anzahlVersteckteEier;
//    }
}
