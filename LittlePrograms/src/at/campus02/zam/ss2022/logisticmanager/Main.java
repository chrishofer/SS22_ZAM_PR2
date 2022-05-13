package at.campus02.zam.ss2022.logisticmanager;

public class Main {
    public static void main(String[] args) {
        LogisticManager hansi = new LogisticManager();
        Shirt s = new Shirt("HansiWear", "L", "snowwhite");
        hansi.add(s);
        hansi.add(new Car("Mercedes Puch G", "military green", 3000));

        hansi.moveAll("Schladming");
    }
}
