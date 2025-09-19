package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
	
	@Test
	void test()
	{
//		Assert.assertEquals("xyz", "xyz");
//		Assert.assertEquals("abc", "123");
		
//		Assert.assertNotEquals(123, 123);
//		Assert.assertNotEquals(123, 345);
		
//		Assert.assertTrue(true);
      //Assert.assertTrue(false);
//        Assert.assertTrue(1==1);
		
//		Assert.assertFalse(1==2);
		Assert.assertFalse(1==1);
		
		Assert.fail();
		
		
	}
	

}
