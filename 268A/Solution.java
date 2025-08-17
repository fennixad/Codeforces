import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 * https://codeforces.com/problemset/problem/268/A
 */
public class Solution {

    public static void main(String[] args) {

        // n: equipos
        // x: local y: visitante

        Scanner scanner = new Scanner(System.in);

        int numeroEquipos = Integer.parseInt(scanner.nextLine());
        int output = 0;

        ArrayList<int[]> camisetasEquipos = new ArrayList<>();

        for (int i = 0; i < numeroEquipos; i ++) {
            String linea = scanner.nextLine();
            String[] colores = linea.split(" ");

            camisetasEquipos.add(
                    new int[] {
                            Integer.parseInt(colores[0]),
                            Integer.parseInt(colores[1])
                    });

        }
        scanner.close();

        for (int i = 0; i < numeroEquipos; i ++) {

            for (int j = 0; j < numeroEquipos; j++) {

                if (i == j) {
                    continue;
                }

                int colorLocalAnfitrion = camisetasEquipos.get(i)[0];
                int colorVisitanteGuest = camisetasEquipos.get(j)[1];

                if (colorLocalAnfitrion == colorVisitanteGuest) {
                    output++;
                }
            }
        }
        System.out.println(output);
    }
}