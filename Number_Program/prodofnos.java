class prodofnos
{
	public static void main(String[] args)
{
	int num = 123;
	int mul = 1;
	while(num > 0)
	{
	int rem = num % 10;
	mul = mul * rem;
	num /= 10;
	}
	System.out.println(mul);


}
}