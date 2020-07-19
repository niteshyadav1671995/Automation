package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDataUtils {
	HashMap<String,String> sampleData = new LinkedHashMap<String,String>();
	@SuppressWarnings("deprecation")
	public InputDataUtils(){
		File file = new File("F:\\Utils\\AmazonCredentialUtils.xlsx");
		XSSFWorkbook wb;
		try {
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			XSSFSheet st = wb.getSheetAt(0);
			Row rw = st.getRow(0);
			int rowCount = st.getPhysicalNumberOfRows();
			
			for(int rowIndex = 0;rowIndex<rowCount;rowIndex++){
				rw = st.getRow(rowIndex);
				rw.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
				sampleData.put(rw.getCell(0).getStringCellValue(),rw.getCell(1).getRichStringCellValue().getString());
			}
			fis.close();
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
	public String getUserName(){
		return sampleData.get("username");
	}
	public String getPassword(){
		return sampleData.get("password");
	}
	public String getSearchKeyword(){
		return sampleData.get("search");
	}
	public String getSignInTitle(){
		return sampleData.get("signintitle");
	}

	public String getBaseURL() {
		return sampleData.get("baseURL");
	}
}
