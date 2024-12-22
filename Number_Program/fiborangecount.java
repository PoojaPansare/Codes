import java.util.Scanner;

class fibocount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        
        // Initialize the first two Fibonacci numbers
        int n1 = 0, n2 = 1;
        int n3 = n1 + n2;
        int count = 0;
        
        // Generate Fibonacci numbers and check if they fall within the range
        while (n1 <= end) {
            if (n1 >= start && n1 <= end) {
                count++;
            }
            
            // Move to the next Fibonacci number
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        
        System.out.println("Number of Fibonacci numbers between " + start + " and " + end + " is: " + count);
        
        sc.close();
    }
}
