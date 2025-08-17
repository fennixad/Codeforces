import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

/**
 * https://codeforces.com/problemset/problem/236/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] letters = inputLine.split("");

        HashSet<String> uniqueLetters = new HashSet<>(Arrays.asList(letters));

        if (uniqueLetters.size() % 2 == 0) {
            System.out.println(uniqueLetters.size());
        } else {
            System.out.println(uniqueLetters.size());
        }


        scanner.close();
    }
}