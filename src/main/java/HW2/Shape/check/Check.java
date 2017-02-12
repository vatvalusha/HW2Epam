package HW2.Shape.check;

import java.util.Scanner;

/**
 * Created by vatva on 12.02.2017.
 */
public class Check {
    public boolean check(Scanner scanner) {
        while (!scanner.hasNextLine()) {
            System.out.println("Incorrect formal");
            System.out.println("Repeat please: ");
            scanner.next();
        }
        return true;
    }

    boolean check2(Scanner scanner) {
        while (scanner.nextInt() == 0) {
            System.out.println("Negative formal");
            System.out.println("Repeat please: ");
            scanner.next();
        }
        return true;
    }
}
