package HW2.Shape.figures;

import HW2.Shape.myExaption.MyExeption;

/**
 * Created by vatva on 12.02.2017.
 */
public class Parallelogram extends Shape {
    private int side1;
    private int side2;
    private int height;


    Parallelogram() {
    }

    public double getArea() {
        return area;
    }

    public Parallelogram(int side1, int side2, int height, String color) {
        name = "Parallelogram";
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.color = color;
//        setPerimeter();
//        setArea();
    }

    public static Parallelogram createParallelogram(int side1, int side2, int height, String color) throws MyExeption {
        if ((side1 <= 0 || height <= 0 || side2 <= 0))
            throw new MyExeption();
        return new Parallelogram(side1, side2, height, color);

    }

    public void madeObj() {
        setPerimeter();
        setArea();
    }

    public void setPerimeter() {
        perimeter = 2 * (side1 + side2);
    }

    public void setArea() {
        area = side1 * height;
    }

    public void setColor(String c) {
        color = c;
    }
}
