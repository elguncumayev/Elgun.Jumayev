package Merge;

public class Apple {

  public final int size;

  public Apple(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return String.format("A[%d]", size);
  }
}
