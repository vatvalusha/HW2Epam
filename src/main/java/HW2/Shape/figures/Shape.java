package HW2.Shape.figurse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by vatva on 12.02.2017.
 */
public class Shape implements FunctForShapes {
    public static List<Shape> ll = new LinkedList<Shape>();

    String color;
    String name;
    double area;
    double perimeter;
//    static double sum;

    final double pi = 3.1415;

    Figure figure;

    Shape() {
    }

    public Shape(Figure figure, String name, int area) {
        this.figure = figure;
        this.name = name;
        this.area = area;
    }


    public static double counterSum(List<Shape> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getArea();
        }
        return sum;
    }

    public void getInfo() {
        System.out.println("Color: " + color + "; Name: "
                + name + "; Area: " + area + "; Perimeter: " + perimeter);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "Shape [name=" + name + ", area=" + area + ", figure=" + figure + "]";
    }
}
