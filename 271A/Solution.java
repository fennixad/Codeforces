import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/271/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        while (true) {
            input ++;
            if (distinctDigits(input)) {
                System.out.println(input);
                break;
            }
        }
        scanner.close();
    }
    
    public static boolean distinctDigits(int num) {

        String numString = String.valueOf(num);
        Set<Character> uniqueDigits = new HashSet<>();

        for (char digit : numString.toCharArray()) {
            if (uniqueDigits.contains(digit)) {
                return false;
            }
            uniqueDigits.add(digit);
        }
        return true;
    }
}