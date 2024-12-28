class  armstrong
{
	public static void main(String[] args) 
	{
		int num = 370;
		int sum = 0;
		int temp = num;

		while(num > 0)
		{
			int digit = num % 10;
			 sum = sum + digit * digit * digit;
			num = num / 10;
		}
		if(temp == sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println(" Not Armstrong");
		}
	}
}
