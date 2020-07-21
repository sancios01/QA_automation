package resourceReader;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ResourceLoader {

	/**
	 * Instantiates a new resource loader.
	 */
	private ResourceLoader() {
	}

	/**
	 * Load resource.
	 *
	 * @param resourceName the resource name
	 * @return the input stream
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static InputStream loadResource(String resourceName) throws IOException {
		ClassLoader classLoader = ResourceLoader.class.getClassLoader();

		InputStream inputStream = null;

		if (classLoader != null) {
			inputStream = classLoader.getResourceAsStream(resourceName);
		}

		if (inputStream == null) {
			classLoader = ClassLoader.getSystemClassLoader();
			if (classLoader != null) {
				inputStream = classLoader.getResourceAsStream(resourceName);
			}
		}

		if (inputStream == null) {
			File file = new File(resourceName);
			if (file.exists()) {
				inputStream = new FileInputStream(file);
			}
		}

		return inputStream;
	}// end loadResource

	/**
	 * Load properties.
	 *
	 * @param resourceName the resource name
	 * @return the properties
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static Properties loadProperties(String resourceName) throws IOException {
		Properties properties = null;
		InputStream inputStream = null;
		try {
			inputStream = loadResource(resourceName);
			if (inputStream != null) {
				properties = new Properties();
				properties.load(inputStream);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
		return properties;
	}

}
