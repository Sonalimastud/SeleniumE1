package Java;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 60;
		int f = 1;
		int count = 0;
		while (f <= n)
		{
			if (n % f == 0)
			{
				count++;
            }
			f++;
		}
		if (count == 2)
			{
				System.out.println(n + " Is a Prime number");
			}
		else
			{
				System.out.println(n + " Is not a Prime number");
			}	

	}

}
