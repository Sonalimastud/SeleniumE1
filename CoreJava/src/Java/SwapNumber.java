package Java;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// Berfore swapping umber
		System.out.println("Berfore swapping");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		// Swapping logic
		int temp = a;
		a= b;
		b = temp;
		
		// After swapping
		System.out.println("Ater swapping");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
