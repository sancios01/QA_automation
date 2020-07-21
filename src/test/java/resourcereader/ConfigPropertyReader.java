package resourcereader;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class ConfigPropertyReader {

	private static String defaultConfigFile = System.getProperty("user.dir") + File.separator + "Config.properties";

	private static Properties getProps(){
		try {
			return ResourceLoader.loadProperties(defaultConfigFile);
		} catch (IOException e) {
			return new Properties();
		}
	}

	public static HashMap<String, String> getSessionConfig(){
		HashMap<String, String> result = new HashMap<>();

		for(Map.Entry<Object, Object> i : getProps().entrySet()){
			result.put(i.getKey().toString(), i.getValue().toString());
		}

		return result;
	}
}
