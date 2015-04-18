package Main;

/**
 * Created by Artur on 17.04.2015.
 */
public class Figure {
    protected double square;
    private String color;
    private String LineWidth;
    public void print(){
        System.out.println("Я фигура!");
    }


    public double getSquare() {
        return square;
    }

    public String getColor() {
        return color;
    }

    public String getLineWidth() {
        return LineWidth;
    }

    public void setLineWidth(String lineWidth) {
        LineWidth = lineWidth;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
