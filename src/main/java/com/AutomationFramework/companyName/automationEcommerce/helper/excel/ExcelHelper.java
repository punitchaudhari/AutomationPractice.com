package com.AutomationFramework.companyName.automationEcommerce.helper.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.model.ConvertAnchor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;

/*import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
*/
public class ExcelHelper {

	Logger log = LoggerHelper.getLogger(ExcelHelper.class);
	// private WebDriver driver;
	FileInputStream fis;

	java.lang.String[][] arr;
	int lastcell, lastrow;

	/*
	 * public ExcelHelper(WebDriver driver){ this.driver = driver; log.info(
	 * "ExcelHelper class Object created"); }
	 * 
	 */
	public String[][] readExcelData(String excelpath, String sheetname, int rowindex, int cellindex)
			throws FileNotFoundException, IOException {

		File file = new File(excelpath);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rowindex);
		XSSFCell cell = row.getCell(cellindex);

		lastcell = row.getLastCellNum();
		lastrow = sheet.getLastRowNum();

		arr = new String[lastrow][lastcell - 2];
		lastcell = lastcell - 2;
		rowindex++;
		cellindex++;
		int k = 0;

		for (int i = 0; i < lastrow; i++) {
		

			for (k = 0; k < lastcell; k++) {
				CellType type = sheet.getRow(rowindex).getCell(cellindex).getCellTypeEnum();
				if (type == CellType.STRING) {
					arr[i][k] = sheet.getRow(rowindex).getCell(cellindex).getStringCellValue();
				}
				if (type == CellType.NUMERIC) {
					sheet.getRow(rowindex).getCell(cellindex).setCellType(CellType.STRING);
					arr[i][k] = sheet.getRow(rowindex).getCell(cellindex).getStringCellValue();
				}
				if (type == CellType.BOOLEAN) {
					sheet.getRow(rowindex).getCell(cellindex).setCellType(CellType.STRING);
					arr[i][k] = sheet.getRow(rowindex).getCell(cellindex).getStringCellValue();
				}
				

				cellindex++;
			}
			
			cellindex = cellindex - lastcell;
			rowindex++;

		}

		fis.close();
		wb.close();
		return arr;


	}


}
