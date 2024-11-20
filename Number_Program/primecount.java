import java.util.Scanner;
class  primecount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int end = sc.nextInt();
		while(start <= end)
		{
			int den = 2;
			while(den < start)
			{
				if(start % den == 0)
				{
					break;
				}
				den++;
			}
			if(start == den)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}