import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/50/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();
        String[] inputs = input.split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        System.out.println((n * m) / 2);
    }
}