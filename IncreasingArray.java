import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreasingArray {
    
    private static long solve(int n, List<Long> numbers) {
        long moves = 0L;
        for (int i = 1; i < n; i++) {
            if (numbers.get(i) < numbers.get(i-1)) {
                moves += (numbers.get(i-1) - numbers.get(i));
                numbers.set(i, numbers.get(i-1));
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextLong());
        }
        System.out.println(solve(n, numbers));
        scanner.close();
    }
}
