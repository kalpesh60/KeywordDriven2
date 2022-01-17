package DemoA.KeywordDrivenFB;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;

	// This method is to set the File path and to open the Excel file
	// Pass Excel Path and SheetName as Arguments to this method
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
	}

	// This method is to read the test data from the Excel cell
	// In this we are passing parameters/arguments as Row Num and Col Num
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
	}

//	 public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
//		    
//			//Create a object of File class to open xlsx file
//		    File file =    new File(filePath+"\\"+fileName);
//		    
//		    //Create an object of FileInputStream class to read excel file
//		    FileInputStream inputStream = new FileInputStream(file);
//		    Workbook Workbook = null;
//		    
//		    //Find the file extension by spliting file name in substing and getting only extension name
//		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
//		    
//		    //Check condition if the file is xlsx file
//		    if(fileExtensionName.equals(".xlsx")){
//		    //If it is xlsx file then create object of XSSFWorkbook class
//		    Workbook = new XSSFWorkbook(inputStream);
//		    }
//		    //Check condition if the file is xls file
//		    else if(fileExtensionName.equals(".xls")){
//		        //If it is xls file then create object of XSSFWorkbook class
//		        Workbook = new HSSFWorkbook(inputStream);
//		    }
//		    //Read sheet inside the workbook by its name
//		    Sheet KeySheet = Workbook.getSheet(sheetName);
//		     return KeySheet;    
//		    }

}
