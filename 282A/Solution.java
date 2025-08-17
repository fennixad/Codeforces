import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/282/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = scanner.nextLine();

            if (statement.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
        scanner.close();

    }
}