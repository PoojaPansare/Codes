public class goodnumber {
    
    // Main method to test the function with example input
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        long n = 1;
        int output = solution.countGoodNumbers(n);
        System.out.println("Output: " + output); // Expected Output: 5
    }

    public int countGoodNumbers(long n) {
        int MOD = 1_000_000_007;
        long result = n % 2 == 0 ? 1 : 5;
        long x = 20;
        for (long i = n / 2; i > 0; i /= 2) {
            if (i % 2 != 0) result = result * x % MOD;
            x = x * x % MOD;
        }
        return (int) result;
    }
}
