import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/750/A
 */

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();
        String[] inputs = input.split(" ");

        int problemas = Integer.parseInt(inputs[0]);
        int tiempoViaje = Integer.parseInt(inputs[1]);
        int tiempoDisponible = 240 - tiempoViaje;

        int output = 0;
        int tiempoAcumulado = 0;

        for(int i = 1; i <= problemas; i++) {

            int tiempoParaResolver = i * 5;

            if (tiempoAcumulado + tiempoParaResolver <= tiempoDisponible) {
                tiempoAcumulado += tiempoParaResolver;
                output++;
            } else {
                break;
            }
        }
        System.out.println(output);
    }
}