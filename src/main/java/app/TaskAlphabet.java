package app;

public class TaskAlphabet {
    public static void main(String[] args) {
        String alphabet = "";
        for (int i = 0; i < 26; i++) {
            alphabet += (char)('A'+i);
        }
        System.out.printf("%s",alphabet);
    }
}