package HW2.Shape.figurse;

import HW2.Shape.myExaption.MyExeption;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 12.02.2017.
 */
public class TriangleTest {
    @Test(expected = MyExeption.class)
    public void checkVarSide1Gerona() throws Exception {
        Triangle.createTriangleGeron(0, 2, 3, "Blue");
    }

    @Test(expected = MyExeption.class)
    public void checkVarSide2Gerona() throws Exception {
        Triangle.createTriangleGeron(1, 0, 3, "Blue");
    }

    @Test(expected = MyExeption.class)
    public void checkVarSide3Gerona() throws Exception {
        Triangle.createTriangleGeron(1, 2, 0, "Blue");
    }

    @Test(expected = MyExeption.class)
    public void checkValuesGeronaTest() throws Exception {
        Triangle.createTriangleGeron(6, 2, 1, "Blue");
    }

    @Test
    public void trueAreaGeronTest() throws MyExeption {
        Triangle triangle = Triangle.createTriangleGeron(3, 3, 5, "Red");
        triangle.madeObjGeron();

    }

    @Test
    public void trueResultForFunctionAreaGeronTest() throws MyExeption {
        Triangle triangle = Triangle.createTriangleGeron(5, 4, 6, "Whight");
        triangle.madeObjGeron();
        assertEquals(9.921567416492215, triangle.getArea(), 0.1);
    }


    @Test
    public void falseResultForFunctionAreaGeronTest() throws MyExeption {
        Triangle triangle = Triangle.createTriangleGeron(8, 8, 8, "Whight");
        triangle.madeObjGeron();
        assertFalse(9.921567416492215 == triangle.getArea());
    }

    @Test(expected = MyExeption.class)
    public void checkVarSide1Simple() throws Exception {
        Triangle.createTriangleGeron(0, 2, 90, "Blue");
    }

    @Test(expected = MyExeption.class)
    public void checkVarSide2Simple() throws Exception {
        Triangle.createTriangleGeron(1, 0, 90, "Blue");
    }

    @Test(expected = MyExeption.class)
    public void checkVarAngleSimple() throws Exception {
        Triangle.createTriangleGeron(1, 2, 0, "Blue");
    }

    @Test
    public void trueResultForFunctionAreaSimpleTest() throws MyExeption {
        Triangle triangle = Triangle.createTriangleSimple(5, 5, 90, "Whight");
        triangle.madeObjSimple();
        assertEquals(12.5, triangle.getArea(), 0.1);
    }

    @Test
    public void falseResultForFunctionAreaSimpleTest() throws MyExeption {
        Triangle triangle = Triangle.createTriangleSimple(3, 9, 90, "Whight");
        triangle.madeObjSimple();
        assertFalse(12.5 == triangle.getArea());
    }
}