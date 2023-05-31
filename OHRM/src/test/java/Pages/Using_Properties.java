package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Using_Properties
{

    public void UsingProperties() throws IOException {
        FileInputStream  inputStream =  new FileInputStream("C:\\Users\\HP\\IdeaProjects\\OHRM\\src\\test\\Properties\\Data.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.getProperty("browser"));

    }

}
