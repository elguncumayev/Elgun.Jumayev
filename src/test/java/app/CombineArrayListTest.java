package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CombineArrayListTest {
  private CombineArrayList task;


  @BeforeEach
  void setUp() {
    this.task = new CombineArrayList();
  }

  @Test
  void test1() {
    //BOTH SAME
    List<Integer> origin1 = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> origin2 = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
    ArrayList<Integer> actual = task.combine(origin1, origin2);
    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    //NO COMMON NUMBER
    List<Integer> origin1 = Arrays.asList(1, 3, 5, 7, 9, 2);
    List<Integer> origin2 = Arrays.asList(4, 6, 8, 10, 12);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12);
    ArrayList<Integer> actual = task.combine(origin1, origin2);
    assertEquals(expected, actual);
  }

  @Test
  void test3() {
    //ONE EMPTY
    List<Integer> origin1 = Collections.emptyList();
    List<Integer> origin2 = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
    ArrayList<Integer> actual = task.combine(origin1, origin2);
    assertEquals(expected, actual);
  }

  @Test
  void test4() {
    //BOTH EMPTY
    List<Integer> origin1 = Collections.emptyList();
    List<Integer> origin2 = Collections.emptyList();
    List<Integer> expected = Collections.emptyList();
    ArrayList<Integer> actual = task.combine(origin1, origin2);
    assertEquals(expected, actual);
  }

  @Test
  void test5() {
    //SOME COMMON NUMBERS
    List<Integer> origin1 = Arrays.asList(1, 3, 5, 7, 9);
    List<Integer> origin2 = Arrays.asList(2, 3, 4, 7, 8, 9);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9);
    ArrayList<Integer> actual = task.combine(origin1, origin2);
    assertEquals(expected, actual);
  }
}