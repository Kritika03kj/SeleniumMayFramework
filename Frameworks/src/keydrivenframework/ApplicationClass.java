package keydrivenframework;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import uTils.GenericMethods;

public class ApplicationClass {
	@Test
	public void validInvalidln() throws IOException {
		System.out.println("check");

		String[][] data = GenericMethods.getData("D:\\GSS\\4. selenium\\framework1.xlsx","KEYWORD");
//		String[][] data = GenericMethods.getData("D:\\GSS\\4. selenium\\framework1.xlsx","KEYWORD");
		
		Methods mtd = new Methods();
		System.out.println(data);
		for(int i = 1; i<data.length;i++) {
			switch(data[i][3]) {
			case "openBrowser":
				mtd.openBrowser();
				break;
			case "maxBrowser":
				mtd.maxBrowserW();
				break;
			case "impWait":
				mtd.impWaitt();
				break;				
			case "navigateToAut":
				mtd.navToAutn(data[i][6]);
				break;
			case "enterinTextBox":
				mtd.enterinLnText(data[i][5], data[i][6]);
				break;
			case "clickBtn":
				mtd.clickButton(data[i][4],data[i][5]);
				break;
			case "errorText":
				String actualText = mtd.errorTextMsg(data[i][4],data[i][5]);
				String expectedText = data[i][6];
				Assert.assertEquals(actualText, expectedText);
				break;
			case "closeApp": 
				mtd.closeApn();	
				break;
								
			}
		}

	}
}
