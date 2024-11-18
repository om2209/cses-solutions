import java.util.Scanner;

class WeirdAlgorithm {

    private static void solve(long n) {

        while (true) {
            System.out.print(n + " ");
            if (n == 1) {
                break;
            } else if (n %2 == 1) {
                n = 3*n + 1;
            } else {
                n = n / 2;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        solve(n);
        scanner.close();
    }
}