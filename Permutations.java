import java.util.Scanner;

public class Permutations {
    
    private static String solve(int n) {

        if (n == 2 || n == 3) {
            return "NO SOLUTION";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i+=2) {
            result.append(i).append(" ");
        }
        for (int i = 1; i <= n; i+=2) {
            result.append(i).append(" ");
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
        scanner.close();
    }
}
