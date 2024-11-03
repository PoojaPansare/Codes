class gfg_Josephus_Problem {
    public int josephus(int n, int k) 
    {
        if (n == 1) return 1; // if there is only 1 person he wont kill another
        return (josephus(n - 1, k) + k - 1) % n + 1;
        // function (n-1 - is no.of ppl in new circle, everytime a person dies ie. n-1
       // k order of killing is same)
       // k - 1 is new start index ie. after killing next index ie. k -1
       // % n + 1 (to add k-1 ie.total died we have to add in new and take mod of n and add 1 tomod to get new)
    }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; // no.of ppl
        int k = 3; // no.of ppl in killing order
        int safePosition = solution.josephus(n, k);
        
        System.out.println("Input: n = " + n + ", k = " + k);
        System.out.println("Output: " + safePosition);
        System.out.println("Explanation: There are " + n + " persons, so skipping " + (k - 1) + " persons (i.e., every " + k + "rd person) will be killed. Thus the safe position is " + safePosition + ".");
    }
}
