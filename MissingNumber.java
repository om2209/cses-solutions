import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MissingNumber {

    private static int solve(int n, List<Integer> numbers) {

        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (Integer number : numbers) {
            xor ^= number;
        }

        return xor;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println(solve(n, numbers));
        scanner.close();
    }
}