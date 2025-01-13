import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        // Input array elements
        System.out.println("Enter array elements in sorted order:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target value
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        
        // Call the method and print the result
        Solution sol = new Solution();
        int result = sol.searchInsert(nums, target);
        System.out.println("The target should be inserted at index: " + result);
        
        sc.close(); // Close scanner
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
