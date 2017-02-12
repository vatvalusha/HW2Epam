package HW2.Shape.myExaption;

/**
 * Created by vatva on 12.02.2017.
 */
public class MyExeption extends Exception {
    @Override
    public String getMessage() {
        return "Can't be zero or less zero";
    }

    public String geronTriangle() {
        return "Triangle is unreal";
    }
}
