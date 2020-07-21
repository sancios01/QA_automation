package resourcereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ResourceLoader {

	private ResourceLoader() {
	}

	public static Properties loadProperties(String resourceName) throws IOException {
		File file = new File(resourceName);
		if (file.exists()) {
			Properties properties = new Properties();
			properties.load(new FileInputStream(file));
			return properties;
		}
		return new Properties();
	}
}
