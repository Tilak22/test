import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFile {

	public static void main(String[] args) throws  IOException 
	{
		File src = new File("./properties/user.properties");
		Properties prop = new Properties();
		
		prop.load(new FileInputStream(src));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("designation"));

	}

}
