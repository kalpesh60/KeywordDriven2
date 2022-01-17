package DemoA.KeywordDrivenFB;

import org.testng.annotations.Test;

public class DriverScript {
	@Test
	public void Fb () throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String excelPath = "C:\\Users\\kalpe\\eclipse-workspace\\KeywordDrivenFB\\Facebook.xlsx";

		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file
		ReadExcelData.setExcelFile(excelPath, "KeySheet");

		// We will be looping over Row and 4th Column
		for (int iRow = 0; iRow <= 6; iRow++) {

			String sActions = ReadExcelData.getCellData(iRow, 4);

			// Comparing the value of Excel cell with all the keywords in the "Actions"
			// class
			if (sActions.equals("openBrowser")) {
				Actions.openBrowser();
			}

			else if (sActions.equals("navigateToURL")) {
				Actions.navigate();
			}

			else if (sActions.equals("enterEmail")) {
				Actions.input_Username();
			}

			else if (sActions.equals("enterPassword")) {
				Actions.input_Password();
			}

			else if (sActions.equals("login")) {
				Actions.click_Login();
			}

//			else if (sActions.equals("closeBrowser")) {
//				Actions.closeBrowser();
//			}
		}
	}
}
