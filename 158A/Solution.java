import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/158/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInput = input.split(" ");

        int participants = Integer.parseInt(splitedInput[0]); //4
        int passNext = Integer.parseInt(splitedInput[1]); //2
        int winners = 0;

        String notes = scanner.nextLine(); //"0" "0" "0" "0"
        String[] splitedNotes = notes.split(" "); //"0" "0" "0" "0"
        int[] scoreList = new int[participants];

        for (int i = 0; i < splitedNotes.length; i ++) {
            scoreList[i] = Integer.parseInt(splitedNotes[i]);

            if (scoreList[i] >= scoreList[passNext-1] && scoreList[i] > 0) {
                winners++;
            }
        }
        scanner.close();
        System.out.println(winners);
    }
}