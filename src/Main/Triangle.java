package Main;

/**
 * Created by Artur on 17.04.2015.
 */
public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        double p = (side1+side2+side3)/2;
        square = Math.pow(p*(p-side1)*(p-side2)*(p-side3),0.5);
    }

    @Override
    public void print(){
        System.out.println("Я есть треугольник!");
    }
}
