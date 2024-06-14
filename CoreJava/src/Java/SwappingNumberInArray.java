package Java;

public class SwappingNumberInArray {

	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50};
		
		// Before swapping
		for(int i = 0; i <a.length; i++)
		{
			System.out.print(a[i]);
		}
		
		//Logic to swap
		for(int i = 0; i < a.length/2; i++)
		{
			int temp = a[i];
			a[i] =a[a.length - i - 1];
			a[a.length - i -1] = temp;
		}
		System.out.println();
		
		// After swapping
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}

	}

}
