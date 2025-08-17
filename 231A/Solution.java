import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/231/A
 */
public class Solution {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = scanner.nextInt(); //3
        int solution = 0;
        int aux = 0;
        
        
        for (int i = 0; i < firstNumber; i ++) { //1
      
            aux += scanner.nextInt();
            aux += scanner.nextInt();
            aux += scanner.nextInt();
            
            if (aux >= 2) {
                solution ++; //1 //2
            }
            aux = 0;
            
        }
        System.out.println(solution);
    }
}