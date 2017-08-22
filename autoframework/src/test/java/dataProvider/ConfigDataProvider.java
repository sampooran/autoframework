package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by sukhjitparihar on 8/21/17.
 */


public class ConfigDataProvider {

    Properties pro;
    public ConfigDataProvider(){

        File src = new File ("./Configs/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);

            pro = new Properties();
            pro.load(fis);

        } catch (Exception e) {

            System.out.println("Exception is" +e);
        }

    }

    public String getApplicationURL(){

        String url = pro.getProperty("url");
        return url;
    }

    public String getChromePath(){

        String ChromePath = pro.getProperty("ChromePath");
        return ChromePath;
    }
}
