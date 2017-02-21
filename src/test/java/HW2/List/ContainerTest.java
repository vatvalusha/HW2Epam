package HW2.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vatva on 20.02.2017.
 */
public class ContainerTest {
    Container<Integer> container;
    Deque<Integer> deque;

    @Before
    public void init(){
        container = new Container<Integer>();
        deque = new ArrayDeque<Integer>();
    }
    @After
    public void deleteObj(){
        container = null;
        deque = null;
    }

    @Test
    public void addNodeInListFront() throws Exception {
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        container.addNodeInListFront(1);
        container.addNodeInListFront(2);
        container.addNodeInListFront(3);
        assertEquals(deque.size(),container.getSize());

    }

    @Test
    public void addNodeInListBack() throws Exception {
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        container.addNodeInListBack(1);
        container.addNodeInListBack(2);
        container.addNodeInListBack(3);

        assertEquals(deque.size(),container.getSize());

    }


    @Test
    public void getSize(){
        container.addNodeInListBack(8);
        container.addNodeInListBack(8);
        container.addNodeInListBack(8);
        int actually = container.getSize();
        deque.addFirst(4);
        deque.addFirst(4);
        deque.addFirst(4);
        int expected = deque.size();
        assertEquals(expected,actually);
    }

    @Test
    public void printList() throws Exception {

    }

    @Test
    public void deleteNodes() throws Exception {
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        container.addNodeInListBack(1);
        container.addNodeInListBack(2);
        container.addNodeInListBack(3);
        deque.remove(1);
        container.deleteNodes(1);
        assertEquals(deque.size(),container.getSize());
    }

}