import java.util.Scanner;

class Repetitions {

    private static int solve(String sequence) {
        
        int maxLength = 1;
        int currentLength = 1;
        int n = sequence.length();

        for (int i = 1; i < n; i++) {
            if (sequence.charAt(i) == sequence.charAt(i-1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        
        return Math.max(maxLength, currentLength);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().trim();
        System.out.println(solve(sequence));
        scanner.close();
    }
}