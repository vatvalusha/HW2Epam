package HW2.List;

/**
 * Created by vatva on 14.02.2017.
 */
public class Container<T> {
    ListElement head;
    ListElement tail;
//    int index;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Container<?> container = (Container<?>) o;

        if (head != null ? !head.equals(container.head) : container.head != null) return false;
        return tail != null ? tail.equals(container.tail) : container.tail == null;
    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + (tail != null ? tail.hashCode() : 0);
        return result;
    }


//    public void setNodeIndex(T data, int index){
//
//        if(head == null){
//            return;
//        }
//        if(head.index == index){
//            head.data = data;
//            return;
//        }
//        if(tail.index == index){
//            tail.data = data;
//            return;
//        }
//        ListElement nodes = head.next;
//        while(nodes != null){
//            if(nodes.index == index){
//                nodes.data = data;
//                return;
//            }
//            nodes = nodes.next;
//        }
//
//    }

//    public void addMiddle(T element, int index){
//        ListElement n = head;
//        ListElement n1 = new ListElement();
//        n1.data = element;
//        while(n.next != null){
//            if(n.index == index){
//                n1.next = n.next;
//                n.next = n1;
//                return;
//            }
//            n = n.next;
//        }
//    }

    public void addNodeInListFront(T data){
        ListElement<T> element = new ListElement<T>();
        element.data = data;
        if(head == null){
            head = element;
            tail = element;
        }else{
            element.next = head;
            head = element;
        }
    }
    public int getSize(){
        ListElement head;
        head = this.head;
        int count = 0;
        if(head != null){
            count++;
            while(head.next != null){
                count++;
                head = head.next;
            }
        }else{
            return 0;
        }
        return count;
    }

    public void addNodeInListBack(T data){
        ListElement<T> element = new ListElement<T>();
        element.data = data;
        if(tail == null){
            tail = element;
            head = element;
        }else{
            tail.next = element;
            tail = element;
        }
    }

    void printList()                //печать списка
    {
        ListElement<T> t = head;
        System.out.print("[");//получаем ссылку на первый элемент
        while (t != null)
            //пока элемент существуе
        {
            System.out.print(t.data + " "); //печатаем его данные
            t = t.next;                     //и переключаемся на следующий
        }
        System.out.print("]");
    }
    public String printListNodes(){
        StringBuffer sb = new StringBuffer();
        //Get reference for the first elm
        ListElement t = head;
        //while elm is exist
        while (t != null)
        {
            //write elm data to sb and go to the next one
//            System.out.print(t.data + " ");
            sb.append(t.data);
            if (t.next != null) sb.append(", ");
            t = t.next;
        }
        return sb.toString();
    }
//    void printList()                //печать списка
//    {
//        ListElement<T> t = head;       //получаем ссылку на первый элемент
//        while (t != null)           //пока элемент существуе
//        {
//            System.out.print(t.index + " "); //печатаем его данные
//            t = t.next;                     //и переключаемся на следующий
//        }
//    }

    public void deleteNodes(T data){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }
        ListElement<T> nodes = head;
        while (nodes.next != null){
            if(nodes.next.data == data){
                if(tail == nodes.next){
                    tail = nodes;
                }
                nodes.next = nodes.next.next;
                return;
            }
            nodes = nodes.next;
        }

    }

    @Override
    public String toString() {
        return "Container{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
