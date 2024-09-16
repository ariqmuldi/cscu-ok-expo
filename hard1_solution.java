// Add parameters in memo[n] and also return memo[n] and not just memo
public class hard1_solution {
    public static void main(String[] args) {
        int n = 10;

        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) { memo[i] = -1; }
        
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n, memo));  // Correct output should be 55
    }

    public static int fibonacci(int n, int[] memo) {
        if (n == 0) { return 0;
        } else if (n == 1) { return 1; }
        
        if (memo[n] != -1) {
            return memo[n];
        }
        
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        
        return memo[n];
    }
    
}
