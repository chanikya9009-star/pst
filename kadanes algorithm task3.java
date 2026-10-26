import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Maximum subarray sum - Kadane's algorithm
            int subarray = arr[0];
            int current = arr[0];

            for (int i = 1; i < n; i++) {
                current = Math.max(arr[i], current + arr[i]);
                subarray = Math.max(subarray, current);
            }

            // Maximum subsequence sum
            int subsequence = 0;
            int maxElement = arr[0];

            for (int x : arr) {
                maxElement = Math.max(maxElement, x);

                if (x > 0) {
                    subsequence += x;
                }
            }

            // If all elements are negative
            if (subsequence == 0) {
                subsequence = maxElement;
            }

            System.out.println(subarray + " " + subsequence);
        }

        sc.close();
    }
}
