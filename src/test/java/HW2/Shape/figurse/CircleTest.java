package HW2.Shape.figurse;

import HW2.Shape.myExaption.MyExeption;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 12.02.2017.
 */
public class CircleTest {
    Circle circle = new Circle();


    @org.junit.Test(expected = MyExeption.class)
    public void setRadiusLessZeroTest() throws Exception {
        circle.setArea(0);
    }

    @Test
    public void setAreaRadiusCorrectTest() throws MyExeption {
        circle.setArea(3);
        double expected = 28.273500000000002;
        double actually = circle.area;
        System.out.println(circle.area);
        assertEquals( expected, actually,0.1);
    }

    public void setAreaIncorrectValues() throws MyExeption {
        circle.setArea(3);
        assertFalse(circle.area == 3);
    }

}