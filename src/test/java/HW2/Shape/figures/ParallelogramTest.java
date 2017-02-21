package HW2.Shape.figures;

import HW2.Shape.myExaption.MyExeption;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 12.02.2017.
 */
public class ParallelogramTest {
    @Test(expected = MyExeption.class)
    public void checkInputVarSide1ForZero() throws Exception {
        Parallelogram.createParallelogram(0, 1, 2, "Yellow");
    }

    @Test(expected = MyExeption.class)
    public void checkInputVaeSide2ForZero() throws Exception {
        Parallelogram.createParallelogram(1, 0, 2, "Yellow");
    }

    @Test(expected = MyExeption.class)
    public void checkInputVarHeightForZero() throws Exception {
        Parallelogram.createParallelogram(1, 1, 0, "Yellow");
    }

    @Test
    public void trueResultTest() throws MyExeption {
        Parallelogram parallelogram = Parallelogram.createParallelogram(3, 4, 4, "Green");
        double expected = 12;
        parallelogram.madeObj();
        double actually = parallelogram.area;
        assertEquals(expected, actually, 0.1);

    }

    @Test
    public void falseResultTest() throws MyExeption {
        Parallelogram parallelogram = Parallelogram.createParallelogram(1, 2, 3, "Red");
        parallelogram.madeObj();
        assertFalse("must be false: ", 12 == parallelogram.getArea());
    }
}