package api.utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "UserNames")
    public String[] getUserNames() throws IOException {
        String path = System.getProperty("user.dir") + "/ExcelData/AECearthData.xlsx";
        XLUtility xl = new XLUtility(path);

        int rownum = xl.getRowCount("RestAssured");

        String[] apidata = new String[rownum];

        for (int i = 1; i <= rownum; i++) {
            apidata[i - 1] = xl.getCellData("RestAssured", i, 1);
        }

        return apidata;
    }

    @DataProvider(name = "Data")
    public String[][] getAllData() throws IOException {
        String path = System.getProperty("user.dir") + "/ExcelData/AECearthData.xlsx";
        XLUtility xl = new XLUtility(path);

        int rownum = xl.getRowCount("RestAssured");
        int colcount = xl.getCellCount("RestAssured", 1);

        String[][] apidata = new String[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {
                apidata[i - 1][j] = xl.getCellData("RestAssured", i, j);
            }
        }

        return apidata;
    }
}