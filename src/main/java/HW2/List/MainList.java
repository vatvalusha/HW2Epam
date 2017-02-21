package HW2.List;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by vatva on 14.02.2017.
 */
public class MainList {
    public static void main(String[] args) {
        Container<Integer>  container = new Container();
        container.addNodeInListBack(1);
        container.addNodeInListBack(2);
        container.addNodeInListBack(3);
//        container.addNodeInListBack(4);
//        container.addNodeInListBack(5);
//        container.addNodeInListFront(455);
        container.printList();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.toString();
// /        System.out.println(container.getSize());
        System.out.println();
        container.printList();
        System.out.println();
        System.out.println(container.getSize());
//        for(byte i = 6, j =0;(j+=i++)<=10;i>>=1,System.out.print(--j));
        byte c = 127;
        c +=1;
        System.out.println("/u000a");
        new Thread().start();
//        System.out.println(deque.size().equals(container.));

//        container.setNodeIndex(5,1);
//        container.deleteNodes(8);
//        container.addMiddle(2,8);
//        container.printList();
//        System.out.println(container.tail.index);
    }
}
