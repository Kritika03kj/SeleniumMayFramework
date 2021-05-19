package keydrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;
	public void openBrowser() {
		driver = new ChromeDriver();
	}
	public void maxBrowserW() {
		driver.manage().window().maximize();
	}
	public void impWaitt() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void navToAutn(String baseURL) {
		driver.get(baseURL);
		//		driver.get(url);
	}
	public void enterinLnText(String locValue, String data) {
		driver.findElement(By.id(locValue)).sendKeys(data);
	}
	public void clickButton(String loc, String locValue) {
		if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();	
		}
		else if(loc.equals("xPath")) {
			driver.findElement(By.xpath(locValue)).click();	

		}
	}
	public String errorTextMsg(String loc, String locValue) {
		String errorTxt = null;
		if(loc.equals("cssSelector")) {
			errorTxt = driver.findElement(By.cssSelector(locValue)).getText();
		}
		else if(loc.equals("id")) {
			errorTxt = driver.findElement(By.id(locValue)).getText();
		}
		return errorTxt;
	}
	public void closeApn() {
		driver.close();
	}


}
