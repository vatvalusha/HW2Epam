package HW2.Shape.figurse;

/**
 * Created by vatva on 12.02.2017.
 */

import HW2.Shape.figurse.Shape;
import HW2.Shape.myExaption.MyExeption;

public class Circle extends Shape {

    int radius;

    Circle(){}

    public Circle(int radius, String color){

        name = "Circle";
        this.radius = radius;
        this.color = color;
        setColor(color);
        try {
            setArea(radius);
        } catch (MyExeption e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        setPerimeter();
    }
    public void setColor(String c) {
        color = c;
    }
    void setArea(int r) throws MyExeption {

        if(r <=0){
            MyExeption exeption = new MyExeption();
            throw exeption;
        }
        else{
            radius = r;
            area = pi*Math.pow(radius, 2);
        }
    }


    double setPerimeter(){
        perimeter = 2*radius*pi;
        return perimeter;
    }
}
