package at.campus02.iwi;

public class Kind {
    private String vname;
    private String zname;
    private int age;

    public Kind(String vn, String zn, int age) {
        vname = vn;
        zname = zn;
        this.age = age;
    }

    @Override
    public String toString() {
        return zname + " " + vname + "("+ age + ")";

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


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


}
