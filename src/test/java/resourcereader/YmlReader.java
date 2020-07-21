package resourcereader;

import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

public class YmlReader {
    private YmlReader(){}

    public static Object getYmlValue(String valueName, String filePath) {
        try{
            Reader doc = new FileReader(filePath);
            // parsez yamel and send it to get value
            return getValue(new Yaml().load(doc), valueName);
        }
        catch (FileNotFoundException e){
            return new Object();
        }
    }

    private static Object getValue(Object obj, String valueName) {
        String[] nodeList = valueName.split("\\.");

        for(String nodeName : nodeList){
            obj = ((Map<String, Object>)obj).get(nodeName);
        }

        return obj;
    }
}
