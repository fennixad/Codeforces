import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/546/A
 */

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int costOfFirstBannana = scanner.nextInt();
        int initialDollars = scanner.nextInt();
        int totalBannanas = scanner.nextInt();

        int output = 0;

        for (int i = 0; i <= totalBannanas; i ++) {

            output += costOfFirstBannana * i;
        }

        if (output - initialDollars >= 0) {
            System.out.println(output - initialDollars);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}