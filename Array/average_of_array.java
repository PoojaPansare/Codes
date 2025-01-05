import java.util.Scanner;
class avgofarray
{
	public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of ele: ");	
	int n = sc.nextInt();
	int sum = 0;
	int [] arr = new int[n];

	System.out.println("Enter ele: ");
	for(int i=0; i<n; i++)
	{
	 arr[i] = sc.nextInt();
	 sum = sum + arr[i];
	}
	int avg = sum / n;
	System.out.println("avg is:" +avg);
	
}
}
