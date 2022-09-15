package Circle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestCircle {
    public static int cntCircle;
    public static List<Circle> arr;

    public static void main(String[] args) {

        arr = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        System.out.print("Input count circle: ");
        cntCircle = console.nextInt();

        double x, y, r;
        for (int i = 0; i < cntCircle; i++) {

            System.out.print("Input x: ");
            x = console.nextDouble();
            System.out.print("Input y: ");
            y = console.nextDouble();
            System.out.print("Input radius: ");
            r = console.nextDouble();

            // Add circle
            arr.add(new Circle(new Point(x,  y), r));
        }

        for (var circ : arr)
            System.out.println(circ.toString());
    }
}