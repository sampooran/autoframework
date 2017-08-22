package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

/**
 * Created by sukhjitparihar on 8/21/17.
 */
public class DataProviderFactory {


    public static ConfigDataProvider getConfig(){

        ConfigDataProvider config = new ConfigDataProvider();
        return config;
    }

    public static ExcelDataProvider getExcel(){

        ExcelDataProvider excel = new ExcelDataProvider();
        return excel;
    }
}
