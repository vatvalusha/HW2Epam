package HW2.Shape.main;

import HW2.Shape.figurse.*;
import HW2.Shape.check.Check;
import HW2.Shape.color.Color;
import HW2.Shape.myExaption.MyExeption;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by vatva on 12.02.2017.
 */
public class View {
    public void view() {
        Scanner scanner = new Scanner(System.in);
//        LinkedList<Shape> ll = new LinkedList<Shape>();
//        Iterator<Shape> it = ll.iterator();
        MyExeption out = new MyExeption();
        Check check = new Check();
        int sc = 0;
        int tr = 0;
        int count = -1;
//        String input = null;
        System.out.println("FIGURA: \n");
        while (sc != 6) {
            System.out.println("1. Ring");
            System.out.println("2. Triangle");
            System.out.println("3. Parallelogram");
            System.out.println("4. Trapezium");
            System.out.println("5 Total amount");
            System.out.println("6. Exit \n");
            System.out.print("Enter figure name: ");
            try {
//                if (check.check(scanner)) input = scanner.nextLine();
//                Figure figure = Figure.valueOf(input);
                switch (sc = scanner.nextInt()) {
                    case 1:
                        System.out.println("Input radius:");
                        int radius = scanner.nextInt();
                        Circle circle = new Circle(radius, Color.randColor());
                        count++;
                        Shape.ll.add(circle);
                        Shape.ll.get(count).getInfo();
                        break;
                    case 2:
                        System.out.println("1. Triangle Gerona.");
                        System.out.println("2. Simple triangle.\n");
                        System.out.println("Choose triangle: ");
                        if (check.check(scanner)) tr = scanner.nextInt();
                        switch (tr) {
                            case 1:
                                count++;
                                System.out.println("Input 1 side triangle: ");
                                int side1 = scanner.nextInt();
                                System.out.println("Input 2 side triangle: ");
                                int side2 = scanner.nextInt();
                                System.out.println("Input 3 side triangle: ");
                                int side3 = scanner.nextInt();
                                if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side2 + side1) {
                                    Triangle triagle = new Triangle(side1, side2, side3, Color.randColor());
                                    Shape.ll.add(triagle);
                                    Shape.ll.get(count).getInfo();
                                } else System.out.println("Triangle unreal");
                                break;
                            case 2:
                                count++;
                                System.out.println("Input 1 side triangle: ");
                                int side_1 = scanner.nextInt();
                                System.out.println("Input 2 side triangle: ");
                                int side_2 = scanner.nextInt();
                                System.out.println("Input angle between a and b triangle: ");
                                double angle = scanner.nextDouble();
                                Triangle triangle = new Triangle(side_1, side_2, angle, Color.randColor());
                                Shape.ll.add(triangle);
                                Shape.ll.get(count).getInfo();
                                break;
                        }
                        break;
                    case 3:
                        count++;
                        System.out.println("Input 1 side para.: ");
                        int side1 = scanner.nextInt();
                        System.out.println("Input 2 side para.: ");
                        int side2 = scanner.nextInt();
                        System.out.println("Input angle para.: ");
                        int height = scanner.nextInt();
                        Parallelogram parallelogram = Parallelogram.createParallelogram(side1, side2, height, Color.randColor());
                        parallelogram.madeObj();
                        Shape.ll.add(parallelogram);
                        Shape.ll.get(count).getInfo();
                        break;

                    case 4:
                        count++;
                        System.out.println("Input 1 side Trapezium:");
                        side1 = scanner.nextInt();
                        System.out.println("Input 2 side Trapezium:");
                        side2 = scanner.nextInt();
                        System.out.println("Input height Trapezium:");
                        height = scanner.nextInt();
                        Trapezium trapezium = Trapezium.createTrapezium(side1,side2,height,Color.randColor());
                        trapezium.madeObj();
                        Shape.ll.add(trapezium);
                        Shape.ll.get(count).getInfo();
                        break;
                    case 5:
                        System.out.println(Shape.counterSum(Shape.ll));
                        break;
                    case 6:
                        sc = 6;
                        System.out.println("Goodbye!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error");
//                e.printStackTrace();
            }
        }

    }
}
