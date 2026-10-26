import java.util.*;

public class Main {

    static int longestPalindrome(String s) {
        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, expand(s, i, i));
            max = Math.max(max, expand(s, i, i + 1));
        }

        return max;
    }

    static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int k = 0; k < n; k++) {
            String rotated = s.substring(k) + s.substring(0, k);
            System.out.println(longestPalindrome(rotated));
        }

        sc.close();
    }
}
