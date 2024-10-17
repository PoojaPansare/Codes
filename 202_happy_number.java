class Solution {
    public boolean isHappy(int n) {
        while(n != 4 && n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 19;  
        boolean result = solution.isHappy(number);
        if (result) {
            System.out.println(number + " is a happy number!");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
