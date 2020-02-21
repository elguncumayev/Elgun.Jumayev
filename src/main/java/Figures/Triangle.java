package Figures;

public class Triangle extends Figure {
  Point p1, p2, p3;

  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  @Override
  double area() {
    return Math.abs((double) ((p1.x * p2.y + p2.x * p3.y + p3.x * p1.y - p1.x * p3.y - p2.x * p1.y - p3.x * p2.y) / 2));
  }

  public static Triangle rand(){
    return new Triangle(Point.rand(),Point.rand(),Point.rand());
  }
}