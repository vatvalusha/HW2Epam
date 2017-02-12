package HW2.Shape.figurse;

import HW2.Shape.myExaption.MyExeption;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 12.02.2017.
 */
public class TrapeziumTest {
    @Test(expected = MyExeption.class)
    public void checkVarSide1ForZero() throws Exception {
        Trapezium.createTrapezium(0, 1, 2, "Red");
    }

    @Test(expected = MyExeption.class)
    public void checkVarSide2ForZero() throws Exception {
        Trapezium.createTrapezium(0, 0, 2, "Red");
    }

    @Test(expected = MyExeption.class)
    public void checkVarHeightForZero() throws Exception {
        Trapezium.createTrapezium(1, 1, 0, "Red");
    }

    @Test
    public void trueResultAreaTest() throws MyExeption {
        Trapezium trapezium = Trapezium.createTrapezium(2, 3, 4, "fd");
        trapezium.madeObj();
        assertEquals(8, trapezium.getArea(), 0.1);
    }

    @Test
    public void falseResultAreaTest() throws MyExeption {
        Trapezium trapezium = Trapezium.createTrapezium(2, 3, 4, "fd");
        trapezium.madeObj();
        assertEquals(10, trapezium.getArea(), 0.1);
    }

}