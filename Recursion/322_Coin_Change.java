class Coin_Change
 {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;

        // Create DP array to store min coins
        int[] minCoinsDP = new int[amount + 1];
        
        // Initialize with max value
        for (int i = 1; i <= amount; i++) {
            minCoinsDP[i] = Integer.MAX_VALUE;
            
            // Try each coin
            for (int coin : coins) {
                if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE) {
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
                }
            }
        }

        // Return the result for the given amount
        return minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = sol.coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
