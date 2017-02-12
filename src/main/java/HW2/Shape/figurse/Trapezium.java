package HW2.Shape.figurse;

import HW2.Shape.myExaption.MyExeption;

/**
 * Created by vatva on 12.02.2017.
 */
public class Trapezium extends Shape {
    private int side1;
    private int side2;
    private int side3;
    private int side4;
    private int height;

    public Trapezium(int side1,int side2,int side3,int side4,String color){
        name = "Trapezium";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        setPerimetr();
    }
    public Trapezium(int side1,int side2,int height, String color){
        name = "Trapezium";
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.color = color;

    }
    public static  Trapezium createTrapezium(int side1, int side2, int height, String color) throws MyExeption {
        if(side1<=0 || side2 <=0 || height<=0) throw new MyExeption();
        return new Trapezium(side1,side2,height,color);
    }

    public void madeObj(){
        setArea();
        setPerimetr();
    }
    public void setColor(String c) {
        color = c;
    }

    public void setPerimetr(){
        perimeter = side1+side2+side3+side4;
    }

    public void setArea(){
        area = ((side1+side2)/2)*height;
    }
}
