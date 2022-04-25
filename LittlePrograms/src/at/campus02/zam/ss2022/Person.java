package at.campus02.zam.ss2022;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String f, String l){
        firstName = f;
        lastName = l;
    }

    public void eatChocolate(){
        System.out.println(firstName + " " + lastName + " eats chocolate");
    }
}
