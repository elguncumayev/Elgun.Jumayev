package Figures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    /*Scanner scanner = new Scanner(System.in);

    int x, y;
    System.out.print("Circle center x: ");
    x = scanner.nextInt();
    System.out.print("Circle center y: ");
    y = scanner.nextInt();
    System.out.print("Circle radius: ");
    int radius;
    radius = scanner.nextInt();
    Point centerTriangle1 = new Point(x, y);
    Figure circle_1 = new Circle(centerTriangle1, radius);

    System.out.print("Rectangle first corner x: ");
    x = scanner.nextInt();
    System.out.print("Rectangle first corner y: ");
    y = scanner.nextInt();
    Point recFirstCor = new Point(x, y);
    System.out.print("Rectangle second corner x: ");
    x = scanner.nextInt();
    System.out.print("Rectangle second corner y: ");
    y = scanner.nextInt();
    Point recSecondCor = new Point(x, y);
    Figure rectangle1 = new Rectangle(recFirstCor, recSecondCor);


    System.out.print("Triangle first corner x: ");
    x = scanner.nextInt();
    System.out.print("Triangle first corner y: ");
    y = scanner.nextInt();
    Point triangleCor1 = new Point(x, y);
    System.out.print("Triangle second corner x: ");
    x = scanner.nextInt();
    System.out.print("Triangle second corner y: ");
    y = scanner.nextInt();
    Point triangleCor2 = new Point(x, y);
    System.out.print("Triangle third corner x: ");
    x = scanner.nextInt();
    System.out.print("Triangle third corner y: ");
    y = scanner.nextInt();
    Point triangleCor3 = new Point(x, y);
    Figure triangle1 = new Triangle(triangleCor1, triangleCor2, triangleCor3);
    */
    ArrayList<Figure> list = new ArrayList<Figure>();

    int testCase = 20;
    while (testCase-- > 0){
      list.add(randomFigure());
    }

    double totalSum = 0;
    

    for (Figure figure : list) {
      System.out.printf("%s area is: %.3f\n",figure.getClass().toString() ,figure.area());
      totalSum+= figure.area();
    }
    System.out.printf("Total sum is: %.3f\n",totalSum);
  }
  public static Figure randomFigure(){
    switch ((int) (Math.random() * 3)){
      case 0: return Triangle.rand();
      case 1: return Rectangle.rand();
      case 2: return Circle.rand();
      default: throw new IllegalArgumentException("Something went wrong");
    }
  }
}