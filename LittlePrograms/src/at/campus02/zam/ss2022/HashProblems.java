package at.campus02.zam.ss2022;

import java.util.HashSet;

public class HashProblems {
    public static void main(String[] args) {
        // zeigen, dass theoretisch unterschiedliche objekte gleichen hashcode haben können
        String s1 = "VII";
        String s2 = "Ugh";
        Osterhase marla = new Osterhase("Marla");
        // wichtig beide ibans gleich - rest egal
        Account a1 = new Account("Mein Konto", "AT123", "BAWATWW");
        Account a2 = new Account("Mein 2. Konto", "AT123", "BAWATWW");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(marla.hashCode());

        // erzeugen eine menge (im mathematischen sinne)
        // warum eine menge? weil diese hat die spezielle eigenschaft
        // dass jedes objekt nur einmal darain sein darf
        // wie entscheid ob ich es schond rinnen ist oder nicht?
        // die collection verwendet intern dafür hashCode (und falls wirklich gleich ist danach noch equals)
        // das wird automatisch beim hinzufügen überprüft

        HashSet<Account> bank = new HashSet<Account>();
        System.out.println(bank.add(a1));
        System.out.println(bank.add(a2));

    }
}
