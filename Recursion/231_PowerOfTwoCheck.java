public class PowerOfTwoCheck {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        int n1 = 16;
        int n2 = 18;
        int n3 = 0;

        // Calling the function and printing results
        System.out.println("Is " + n1 + " a power of two? " + solution.isPowerOfTwo(n1)); // Expected: true
        System.out.println("Is " + n2 + " a power of two? " + solution.isPowerOfTwo(n2)); // Expected: false
        System.out.println("Is " + n3 + " a power of two? " + solution.isPowerOfTwo(n3)); // Expected: false
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) { // Test case for zero
            return false;
        }
        while(n != 1) { // Run loop until n is equal to 1
            if(n % 2 != 0) { // If n is not divisible by 2
                return false; // Then it's not a power of 2
            } else {
                n = n / 2; // Divide n by 2
            }
        }
        return true; // n is a power of 2 if loop completes
    }
}
