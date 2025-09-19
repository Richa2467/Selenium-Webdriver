package Day42;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

/*
 *1. open app
 *2. Login
 *3. Logout
 */



public class FirstTestCase {
	
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from application");
		
	}
	
	
	@Test(priority=-1)
//	@Test
	void openapp()
	{
		System.out.println("Opening to application");
		
	}
	
//	@Test(priority=2)
	@Test(priority=0)
	void login()
	{
		System.out.println("Login to application");
		
	}
	
	
	

}
