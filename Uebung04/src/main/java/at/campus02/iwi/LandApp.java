package at.campus02.iwi;

public class LandApp {
    public static void main(String[] args) {

        Bundesland bl1 = new Bundesland(1000);
        Bundesland bl2 = new Bundesland(4000);
        Bundesstaat bs = new Bundesstaat();
        System.out.println(bl1.getBruttoSozialProdukt());
        System.out.println(bl2.getBruttoSozialProdukt());

        bs.addLand(bl1);
        bs.addLand(bl2);
        System.out.println(bs.getBruttoSozialProdukt());

    }
}
