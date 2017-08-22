package dataProvider;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by sukhjitparihar on 8/21/17.
 */
public class ExcelDataProvider {
// creating constructor

    XSSFWorkbook  wb;

   public ExcelDataProvider(){

       File src = new File("./TestData/data.xlsx");

       try {
           FileInputStream fis = new FileInputStream(src);

           wb = new XSSFWorkbook(fis);

       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Error is ..."+e);
       }

   }
    // get sheet index

   public String getData(int sheetIndex, int row, int column ){
       String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
       return data;
   }
    // get sheet name

    public String getData(String sheetName, int row, int column ){
        String data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}
