package at.campus02.zam.ss2022;

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account("Mein Konto", "AT...", "BAWATWW");
        Account a2 = new Account("Dein Konto", "AT...", "STMKSPK");
        Account a3 = new Account("Ihr Konto", "AT...", "RAIKA");

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

    }
}
