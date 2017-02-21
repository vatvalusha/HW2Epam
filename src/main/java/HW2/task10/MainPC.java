package HW2.task10;


/**
 * Created by vatva on 20.02.2017.
 */
public class MainPC{
    public static void main(String[] args) {
        Computer pc = new Computer("Pentium 4",3.4,3,1024);
        System.out.println(pc.isStatus());

        pc.switchStatusPC();
        System.out.println(pc.isStatus());
        pc.memoryPC();


    }
}
