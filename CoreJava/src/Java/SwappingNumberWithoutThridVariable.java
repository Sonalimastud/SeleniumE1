package Java;

public class SwappingNumberWithoutThridVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		 
		//Logic to swap without third variable
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping");
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

}
