package HW2.Shape.figurse;

/**
 * Created by vatva on 12.02.2017.
 */
public class Triangle extends Shape {
    private int side1;
    private int side2;
    private double side3;
    private double angle;

    public Triangle() {
    }

    public Triangle(int a, int b, int c, String color) {
        name = "Triangle Gerona";
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        this.color = color;
        setAreaGerona(side1, side2, side3);
        setPerimeterGerona();
        setColor(color);
    }

    public Triangle(int a, int b, double angle, String color) {
        name = "Simple Triangle";
        this.side1 = a;
        this.side2 = b;
        this.angle = angle;
        this.color = color;
        setAreaAngle(side1, side2, angle);
        setPerimeter();
        setColor(color);
    }

    public static Triangle createTriangle(){
        return null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAreaAngle(int a, int b, double angle) {
        side1 = a;
        side2 = b;
        this.angle = angle;
        area = 0.5 * side1 * side2 * Math.sin(angle);
    }

    public void setAreaGerona(int a, int b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
        double p = (side1 + side2 + side3) / 2;
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    void setPerimeter() {
        if (angle == 90) {
            side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        } else
            side3 = Math.sqrt(Math.pow(side1, 2) * Math.pow(side2, 2) - 2 * side1 * side2 * Math.cos(Math.toRadians(angle)));
        setPerimeterGerona();
    }

    public void setPerimeterGerona() {
        perimeter = side1 + side2 + side3;
    }
}
