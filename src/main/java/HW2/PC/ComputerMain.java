package HW2.PC;

/**
 * Created by vatva on 13.02.2017.
 */
public class ComputerMain {
    public static void main(String[] args) {
        Computer pc = new Computer("PC", 3.4, 3, 1024);
        System.out.println(pc.isStatus());

        pc.switchStatus();
        System.out.println(pc.isStatus());
        pc.memoryPC();

        System.out.println("Virus scan result: " + pc.scanViruses());
    }
}
