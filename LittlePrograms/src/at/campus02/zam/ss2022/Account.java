package at.campus02.zam.ss2022;

import java.util.Objects;

public class Account {
    private static int uniqueID = 1;

    private String owner;
    private String iban;
    private String bic;
    private int accountID;
    private double balance;

    public Account(String owner, String iban, String bic){
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        accountID = uniqueID++;
        balance = 0.0;
    }

    public void add(double wert) {
        if(wert > 0) {
            balance += wert;
        }
    }
    public double deposit(double wert){
        if(wert > 0) {
            if(wert < balance) {
                balance = balance - wert;
            } else {
                wert = balance;
                balance = 0;
            }
            return wert;
        }
        return 0;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", accountID=" + accountID +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }
}
