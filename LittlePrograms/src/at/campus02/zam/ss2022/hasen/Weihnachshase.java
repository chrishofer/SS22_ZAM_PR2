package at.campus02.zam.ss2022.hasen;

public class Weihnachshase extends Hase {
    public Weihnachshase(String n) {
        super(n);
    }

    @Override
    public void hoppeln() {
        System.out.println("Weihnachtshase " + name + " wälzt sich durch den Schnees und bringt Geschenke");
    }
    public void verteileGeschenke(){
        System.out.println(name + " gräbt sich durch den Boden und verteilt Geschenke - hätte bei Albuquerque links abbiegen");
    }


}
