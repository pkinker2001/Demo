package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static Properties readPropertiesFile() throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("src/main/resources/Configuration.properties");
		prop.load(ip);
		return prop;
	}
	
	

}
