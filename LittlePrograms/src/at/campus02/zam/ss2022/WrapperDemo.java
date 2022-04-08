package at.campus02.zam.ss2022;

public class WrapperDemo {
    public static void main(String[] args) {
        // aufgrund von autobxing können int und Integer stellvertretend verwenden werden
        Integer i = 22;
        int j = new Integer(27); // durchgestrichen da deprecated - einfach ohne Integer KOnstruktor machen
        Integer k = null;

        System.out.println(i);
        System.out.println(j);
        int l = Integer.parseInt("16"); // fuer kommazahl bei Double. schauen
        System.out.println(("16" + 2));
        System.out.println((l + 2));

        String s = new String("Hansi");


    }
}
