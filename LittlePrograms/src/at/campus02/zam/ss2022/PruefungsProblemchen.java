package at.campus02.zam.ss2022;

public class PruefungsProblemchen {
    public static void main(String[] args) {

        String erg = welcheBox();
        System.out.println(erg);

        int [][] array = {{1,2,3},{4,5,6}};

        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array[i].length; ++j){ // [i] wurde oft vergessen :(

            }
        }

    }
    public static String welcheBox(){
        int age = 27;
        boolean vegan = true;
        boolean sportlich = true;

        // person soll vegane box bekommen wenn sie nur vegan ernährt
        // person soll fisch box bekommen wenn sie unter 30 ist und sportlich
        String result = null;

        if(vegan){
            result = "vegane box"; // vegane box yumm yumm schreiben statt vegan
            // hier gleich das return machen
        }
        else if( age < 30 && sportlich){
            result = "fisch";
        }
        return result;
    }
}
