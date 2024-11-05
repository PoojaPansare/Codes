class Beautiful_String {
    public int minChanges(String s) {
        int count = 0; // Count to store the number of steps to make the string beautiful
        
        for (int i = 1; i < s.length(); i += 2) { // Loop through the string, incrementing by 2 to consider pairs (even-length requirement)
            if (s.charAt(i - 1) != s.charAt(i)) {
                // If the current and next character are not the same, increment count
                // This keeps track of all pairs that are not identical
                count++;
            }
        }
        
        return count; // Return the count of changes needed to make the string beautiful
    }
}

// Example
// Input: s = "10101000"
// Divide into pairs: 10 10 10 00
// Check each pair:
// Pair 0: "10" -> Not beautiful because it contains 1 and 0, so count = 1
// Pair 1: "10" -> Not beautiful, so count = 2
// Pair 2: "10" -> Not beautiful, so count = 3
// Pair 3: "00" -> Beautiful as it contains only 0s, no increment to count
// Final result: count = 3
