package genericPackage;

import java.util.Random;

public class Worklib extends BaseTest{
	
	public int randomNum()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;	
	}

}
