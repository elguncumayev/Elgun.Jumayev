package Figures;

public class Rectangle extends Figure {
  Point corner1, corner2;

  public Rectangle(Point corner1, Point corner2) {
    this.corner1 = corner1;
    this.corner2 = corner2;
  }

  @Override
  double area() {
    return (double) ((corner1.x - corner2.x) * (corner1.x - corner2.x) + (corner1.y - corner2.y) * (corner1.y - corner2.y)) / 2;
  }
  public static Rectangle rand(){
    return new Rectangle(Point.rand(),Point.rand());
  }
}
