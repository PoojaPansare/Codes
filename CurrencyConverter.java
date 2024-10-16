import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Assuming the exchange rate is 0.016 SGD for 1 INR
        double exchangeRate = 0.016;

        System.out.println("Enter amount in INR: ");
        double amountInINR = in.nextDouble();
        
        double amountInSGD = amountInINR * exchangeRate;
        
        System.out.println("Equivalent amount in SGD: " + amountInSGD);
    }
}
