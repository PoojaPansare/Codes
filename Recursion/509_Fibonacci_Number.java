public class FibonacciCalculation {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Input
        int n = 3;

        // Calling the function and printing the result
        System.out.println("Fibonacci of " + n + " is: " + solution.fib(n)); // Expected output: 2
    }
}

class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
