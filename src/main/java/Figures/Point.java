package Figures;

public class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public static Point rand(){
    return new Point((int) (Math.random() * 30 -15),(int) (Math.random() * 30 -15));
  }
}