package examples;
import java.util.*;
import java.io.*;

public class PropertiesExample {
	
	public void readDataProperties() {
		try {
		//System.out.println(System.getProperty("user.dir")+"\\src\\examples\\data1.properties");
		FileReader freader = new FileReader(System.getProperty("user.dir")+"\\src\\examples\\data1.properties");
		
		Properties prop = new Properties();
		prop.load(freader);
		
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("hello", "GoodMorning");
		System.out.println(prop.getProperty("hello"));
		
		freader.close();
		
		prop.store(new FileWriter(System.getProperty("user.dir")+"\\src\\examples\\info.properties"),"comments");
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
