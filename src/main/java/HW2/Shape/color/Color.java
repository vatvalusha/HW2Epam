package HW2.Shape.color;

/**
 * Created by vatva on 12.02.2017.
 */
public class Color {
    static String[] color = {"Red", "Green", "Blue", "Yelow","Pink","Orange","Brown","Black","White","Gray"};
    public static String randColor(){
        return color[(int)((Math.random()*10))];
    }
}
