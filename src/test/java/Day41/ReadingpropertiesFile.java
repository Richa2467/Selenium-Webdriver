package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingpropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//location of the proprties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		
		//loading properties file
		Properties proper=new Properties();
		proper.load(file);
		
		//Reading data from the properties file.
		String url=proper.getProperty("aapurl");
		String email=proper.getProperty("email");
		String orderid=proper.getProperty("orderid");
		String customerid=proper.getProperty("customerid");
		
		System.out.println(url+ " "+email+ " "+orderid+ " "+customerid);
	
		
		//reading all the keys from the properties file
		
		Set<String> keys=proper.stringPropertyNames();
		
		System.out.println(keys);
		
		Set<Object> keyso=proper.keySet();
		System.out.println(keyso);

		 //Reading all the values from the properties file
		Collection<Object> values=proper.values();
		System.out.println(values);
		
		file.close();
		
		
		
		
		
		
		

	}

}
