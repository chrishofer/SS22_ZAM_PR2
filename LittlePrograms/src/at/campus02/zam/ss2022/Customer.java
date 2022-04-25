package at.campus02.zam.ss2022;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;
    //private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(String f, String l, int customerNumber){
        super(f, l);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }
    public void addAddress(Address a){
        addresses.add(a);
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses + "person: " + firstName +
                '}';
    }
}
