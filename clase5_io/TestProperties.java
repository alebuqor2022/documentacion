package clase5_io;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		Properties props=System.getProperties();

		Enumeration propNames=props.propertyNames();
		
		while(propNames.hasMoreElements()) {
			String propName=(String)propNames.nextElement();
			String property=props.getProperty(propName);
			System.out.println("prop: " + propName + " es " + property);
		}
		
	}

}
