package Main;

/**
 * Created by Artur on 17.04.2015.
 */
public class Cycle extends Figure {
    private double radius;

    public Cycle(double radius) {
        this.radius = radius;
        square = 3.14*radius*radius;
    }
    @Override
    public void print(){
        System.out.println("Я круг!");
    }
}
