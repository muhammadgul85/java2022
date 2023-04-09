package properties.read.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("Properties\\Config.properties") ;//you can use relative path rather than full path as it's in project C:\\Users\\User\\Documents\\Eclipse-WorkSpace\\Reyaz\\Properties\\Config.properties"
		
		//Create a properties obj, this class comes in Java
		Properties pr = new Properties();
		
		pr.load(fis);//use load method
		
		System.out.println(pr.getProperty("browser"));
		
		System.out.println(pr.getProperty("url"));

	}

}
