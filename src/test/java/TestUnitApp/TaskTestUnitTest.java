package TestUnitApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTestUnitTest {

  private Filterable task;

  @BeforeEach
  void setUp() {
    this.task = new TaskTestUnit();
  }

  @Test
  void filter1() {
    String origin = "Hello";
    String expected = "hll";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }

  @Test
  void filter2() {
    String origin = "eee";
    String expected = "";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }

  @Test
  void filter3() {
    String origin = "";
    String expected = "";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }

  @Test
  void filter4() {
    String origin = null;
    String expected = null;
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }

  @Test
  void filter5() {
    String origin = "   ##$%^&AHCehsbaucbihja  Wb ii dHodg  yGY AGHabd h Ee  II hyHEAHBb  WAH ibIdaHBADA Ydywhb ^@AaIo&Yi*Q o ASvbxgavs x   ";
    String expected = "##$%^&hchsbcbhj wb dhdg ygy ghbd h hyhhbb wh bdhbd ydywhb ^@&y*q svbxgvs x";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }

  @Test
  void filter6() {
    String origin = "Sometimes to understand a word's meaning you need more than a definition.";
    String expected = "smtms t ndrstnd wrd's mnng y nd mr thn dfntn.";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }

}