package at.campus02.zam.ss2022.hasen;

public class Osterhase extends Hase {
    public Osterhase(String n) {
        super(n);
    }
    public void versteckeOstereier(){
        System.out.println(name + " versteckt ganz viele bunte selbstgemachte nachhaltige regionale Demeter (Schokoladen)Eier");
    }
    @Override
    public void hoppeln() {
        System.out.println("Osterhase " + name + " springt durch die Luft und versteckt Eier");
    }
}
