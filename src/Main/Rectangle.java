package Main;

/**
 * Created by Artur on 17.04.2015.
 */
public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        square = width*height;
    }

    @Override
    public void print(){
        System.out.println("Я есть прямоугольник!");
    }
}
