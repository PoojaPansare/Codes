class bintodec {
    public static void main(String[] args) 
	{
        System.out.println(bintodec(11011));
    }

    public static int bintodec(int bin) 
	{
        int sum = 0, i = 0;
        while (bin != 0) 
		{
            int rem = bin % 10;
            if (rem != 0)
			{
                sum = sum + rem * power(2, i);
            }
            i++;
            bin /= 10;
        }
        return sum;
    }

    public static int power(int base, int raise) {
        int pow = 1;
        for (int i = 1; i <= raise; i++) {
            pow *= base;
        }
        return pow;
    }
}
