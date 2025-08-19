import java.util.Scanner;
/**
 * https://codeforces.com/problemset/problem/155/A
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int competiciones = Integer.parseInt(scanner.nextLine());
        String puntuaciones = scanner.nextLine();
        String[] puntuacionesArray = puntuaciones.split(" ");
        scanner.close();
        int output = 0;
        int peorRecord = Integer.parseInt(puntuacionesArray[0]);
        int mejorRecord = Integer.parseInt(puntuacionesArray[0]);

        for (int i = 0; i < competiciones; i ++) {
            if (Integer.parseInt(puntuacionesArray[i]) < peorRecord) {
                peorRecord = Integer.parseInt(puntuacionesArray[i]);
                output++;
            } else if (Integer.parseInt(puntuacionesArray[i]) > mejorRecord) {
                mejorRecord = Integer.parseInt(puntuacionesArray[i]);
                output++;
            }
        }
        System.out.println(output);
    }
}