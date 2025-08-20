import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1703/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputNumber; i ++) {
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}