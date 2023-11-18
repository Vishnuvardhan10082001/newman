package GenericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Common {
	public String user(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/shopeer.properties");
		Properties p1=new Properties();
		p1.load(fis);
		String usn=p1.getProperty(key);
		return usn;
	}

}
