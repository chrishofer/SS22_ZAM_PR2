package at.campus02.zam.ss2022;

public class MaybeInt {
    private int data;
    private int status;
    // generische Version der Klasse - der Typ T wird dann ersetzt durch konkreten Typ
    // nach Erzeugung einer Instanz
    public MaybeInt(int data, int status) {
        this.data = data;
        this.status = status;
    }

    public void print(){
        switch(status){
            case 1:
                System.out.println("Zugriff gewährt:"+data);
                break;
            case 2:
                System.out.println("Geht dich nichts an!");
                break;
            case 3:
                System.out.println("Daten nicht erfasst!");
                break;
            default:
                System.out.println("Bitte Status zwischen 1 und 3 wählen!");
                break;
        }
    }
}