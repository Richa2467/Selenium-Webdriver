package Day44;

import org.testng.annotations.Test;

public class PaymentTests {
	
	@Test(priority=1,groups={"sanity","regression","functional"})
	void paymentinRupees()
	{
		System.out.println("Payment in rupees");
	}
	
	@Test(priority=2,groups={"sanity","regression","functional"})
	void paymentindollers()
	{
		System.out.println("Payment in dollers");
	}
	
	

}
