class dectohex 
{
	public static void main(String[] args) 
	{
		System.out.println(dectohex(245));
	}
	public static String dectohex(int num)
	{
		String hex = " ";
		while(num != 0)
		{
			int rem = num % 16;
			if(rem >=0 && rem <=9)
			{
				hex = rem + hex;
			}
			else
			{
				hex = ((char)(rem+55))+hex;
			}
			num = num/16;
		}
		return hex;
	}
}
