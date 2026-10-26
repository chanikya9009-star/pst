import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char expected;

            if (i % 3 == 0 || i % 3 == 2) {
                expected = 'S';
            } else {
                expected = 'O';
            }

            if (s.charAt(i) != expected) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
