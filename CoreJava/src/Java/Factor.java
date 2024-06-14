package Java;

public class Factor {

	public static void main(String[] args) {
		int num = 6;
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i + " =is a factor");
			}
			else
			{
				System.out.println(i + " =Is not a factor");
			}
		}

	}

}
