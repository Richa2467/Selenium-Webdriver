package Day43;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test
	void testTitle()
	{
		
		String  exp_title="openCart";
		String act_title="Openshop";
		
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("Test passed");
//		}
//		else
//		{
//			System.out.println("Test Failed");
//		}
//		
//		Assert.assertEquals(exp_title, act_title);
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
		
	}

}
