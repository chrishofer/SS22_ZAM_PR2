package at.campus02.zam.ss2022.sortieren;

public class Mitarbeiter implements Comparable<Mitarbeiter>{
    private String vname;
    private String zname;
    private int geburtsjahr;

    public Mitarbeiter(String vname, String zname, int geburtsjahr) {
        this.vname = vname;
        this.zname = zname;
        this.geburtsjahr = geburtsjahr;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "vname='" + vname + '\'' +
                ", zname='" + zname + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                '}';
    }


    // i decided that we want to sort it the following way
    // by the birth year starting with the youngest person
    @Override
    public int compareTo(Mitarbeiter o) {
        if(this.geburtsjahr > o.geburtsjahr){
            return -1;
        }
        if(this.geburtsjahr < o.geburtsjahr){
            return 1;
        }
        return 0;
    }
}
