package Figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("Circle center x: ");
        x = scanner.nextInt();
        System.out.print("Circle center y: ");
        y = scanner.nextInt();
        System.out.print("Circle radius: ");
        int radius;
        radius = scanner.nextInt();
        Point centerTriangle1 = new Point(x,y);
        Figure circle_1 = new Circle(centerTriangle1,radius);
        System.out.printf("Area Circle: %.2f\n",circle_1.area());


    }
}
