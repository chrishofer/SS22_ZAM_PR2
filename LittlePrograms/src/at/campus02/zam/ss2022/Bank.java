package at.campus02.zam.ss2022;

import java.util.HashMap;

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account("Dagobert", "AT...", "BAWATWW");
        Account a2 = new Account("Daisy", "AT...", "STMKSPK");
        Account a3 = new Account("Donald", "AT...", "RAIKA");
        Account a4 = a1;
        a1.add(1000);
        a2.add(400);
        a3.add(200);

        //Account []accounts = new Account[3]; // und dann zuweisen
        Account []accounts = {a1, a2, a3};

        for(Account a : accounts){
            System.out.println(a);
        }
        System.out.println(a3.deposit(1000));
        for(int i=0; i < accounts.length; ++i){
            System.out.println(accounts[i]);
        }

        // wir möchten die accounts über den namen der bestitzer*innen zugreifen
        // mapping von Dagobert Duck --> Account(....)
        // Dagobert Duck ist ein Beispiel für ein Schlüsselelement -> String
        // Account(...) ist ein Beispiel für einen Wert -> Account()
        // Achtung: wenn wir das so machen kann jede person maximal nur einen account haben
        HashMap<String, Account> bank = new HashMap<>();

        bank.put("Dagobert", a1);
        bank.put("Daisy", a2);
        bank.put("Donald", a3);

        // gibt es einen wert hinter dem schlüssel dagobert?
        System.out.println(bank.containsKey("Dagobert"));
        // möchten den wert des schlüssel daisy erhalten (also ihr konto)
        System.out.println(bank.get("Daisy"));

        // einmal drüber iterieren -> achtung etwas anders
        for(String owner : bank.keySet()){
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }

    }
}
