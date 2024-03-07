package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingCommaDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commanData.properties"); // create the object of fileinputstream
		Properties prop = new Properties(); // create the object of property file
		prop.load(fis); // load all the keys
		String value = prop.getProperty("URL"); // use get property method
		System.out.println(value);

	}

}
