import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberSpiral {

    private static long solve(long y, long x) {
        
        if (x <= y) {
            if (y % 2 == 0) {
                return y*y - (x - 1);
            } else {
                return (y-1)*(y-1) + x;
            }
        } else {
            if (x % 2 == 1) {
                return x*x - (y - 1);
            } else {
                return (x-1)*(x-1) + y;
            }
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        // StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            long y = Long.parseLong(line[0]);
            long x = Long.parseLong(line[1]);
            // result.append(solve(y, x)).append("\n");
            System.out.println(solve(y, x));  // we can comment this line and uncomment other lines to print the result faster (almost half time)
        }
        // System.out.println(result.toString());
    }
}
