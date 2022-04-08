package at.campus02.zam.ss2022;

public class MaybeTest {
    public static void main(String[] args) {
        Maybe<Double> gehalt = new Maybe<Double>(2030.36, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Laura", "AT340340", "RAIKA"),1);
        meinKonto.print();
    }
}
