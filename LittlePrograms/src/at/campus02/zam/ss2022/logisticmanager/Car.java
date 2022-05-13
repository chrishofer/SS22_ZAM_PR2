package at.campus02.zam.ss2022.logisticmanager;

public class Car implements Moveable{
    public String type;
    public String color;
    public double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public void move(String dest) {
        System.out.println("Auto " + color + " " + type + " wird nach " + dest + "überführt");
    }
}
