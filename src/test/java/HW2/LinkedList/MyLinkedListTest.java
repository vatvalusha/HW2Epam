package HW2.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.plugin.javascript.navig.Array;

import java.nio.channels.IllegalSelectorException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vatva on 21.02.2017.
 */
public class MyLinkedListTest {
    MyLinkedList<Integer> myList;
    List<Integer> list;

    @Before
    public void init() {
        myList = new MyLinkedList<Integer>();
        list = new LinkedList<Integer>();
    }

    @After
    public void clearObject() {
        myList = null;
        list = null;
    }


    @Test
    public void isEmptyTrue() throws Exception {
        assertTrue(myList.isEmpty() == list.isEmpty());
    }

    @Test
    public void isEmptyFalse() throws Exception {
        myList.add(4);
        assertFalse(myList.isEmpty() == list.isEmpty());
    }

    @Test
    public void addFirst() throws Exception {
        myList.addFirst(1);
        myList.addFirst(2);
        int expected[] = {2,1};
        assertEquals(Arrays.toString(expected), myList.toString());
    }

    @Test
    public void add() throws Exception {
        myList.add(1);
        myList.add(2);
        int expected[] = {1,2};
        assertEquals(Arrays.toString(expected),myList.toString());
    }


    @Test
    public void remove() throws Exception {
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.remove();
        int expected[] = {2,3};

        assertEquals(Arrays.toString(expected),myList.toString());
    }

    @Test
    public void remove1Object() throws Exception {
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addFirst(1);
        myList.add(3);
        myList.remove(3);
        int expected[] = {1,2,3};
        assertEquals(Arrays.toString(expected),myList.toString());
    }



    @Test
    public void clear() throws Exception {
        myList.add(4);
        myList.add(2);
        myList.add(1);
        myList.clear();
        assertEquals(0,myList.size());
    }

    @Test
    public void size() throws Exception {

        myList.add(3);
        myList.add(2);
        myList.add(2);
        int expected = 3;
        assertTrue(expected == myList.size());

    }

    @Test
    public void contains() throws Exception {

    }

}