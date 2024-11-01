public class PowerOfThreeCheck {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        int n1 = 27;
        int n2 = 10;
        int n3 = 1;

        // Calling the function and printing results
        System.out.println("Is " + n1 + " a power of three? " + solution.isPowerOfThree(n1)); // Expected: true
        System.out.println("Is " + n2 + " a power of three? " + solution.isPowerOfThree(n2)); // Expected: false
        System.out.println("Is " + n3 + " a power of three? " + solution.isPowerOfThree(n3)); // Expected: true
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) { // If n is not divisible by 3
                return false;
            }
            n = n / 3; // Divide n by 3
        }
        return n == 1; // If loop completes, n must be 1 for it to be a power of 3
    }
}
