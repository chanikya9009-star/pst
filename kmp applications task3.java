import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            boolean found = false;

            for (char c = 'a'; c <= 'z'; c++) {
                if (s1.indexOf(c) != -1 && s2.indexOf(c) != -1) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}
