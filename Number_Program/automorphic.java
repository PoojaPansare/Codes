class automorphic 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int power = 1;
		int square = num * num;
		for(int i=num; i>0; i/=10)
		{
			power = power * i;
		}
		if(square % power == num)
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("Not Automorphic Number");		
		}

	}
}
