package Figures;

public class Circle extends Figure {
  Point center;
  double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }

  public static Circle rand(){
    return new Circle(Point.rand(),(int)(Math.random()*15));
  }
}
