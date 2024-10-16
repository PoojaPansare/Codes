import java.util.Scanner;
class lengthconversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in meter: ");
		double meter = sc.nextInt();
		metertokm(meter);
		metertocm(meter);
		metertodm(meter);
		metertohm(meter);
	}
	public static void metertokm(double meter){
		double kilometer = meter * 0.001;
		System.out.println("Kilometer are: " +kilometer);
	}
	public static void metertocm(double meter){
		double centimeter = meter * 100;
		System.out.println("Centimeter are: " + centimeter);
	}
	public static void metertodm(double meter){
		double decimeter = meter * 10;
		System.out.println("Decimeter are: " +decimeter);
	}
	public static void metertohm(double meter){
		double hectometer = meter * 0.01;
		System.out.println("Hectometer are: " +hectometer);

	}

}

