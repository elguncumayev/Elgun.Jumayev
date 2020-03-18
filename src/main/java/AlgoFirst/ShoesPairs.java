package AlgoFirst;

public class ShoesPairs {
  int calc(String origin) {
    int temp=1;
    int result = 0;
    char first,second;
    first = origin.charAt(0);
    for (int i = 1; i < origin.length(); i++) {
      second = origin.charAt(i);
      if (second == first) {
        temp++;
      } else temp--;
      if (temp == 0) {
        result++;
      }
    }
    return result;
  }
}
