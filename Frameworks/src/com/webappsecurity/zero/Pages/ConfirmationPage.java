package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confTextBox;
	
	@FindBy(css = "#settingsBox > ul > li:nth-child(3) > a")
	private WebElement usernameBtn;
	
	@FindBy(id = "logout_link")
	private WebElement logoutBtn;
	
	public ConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getConText() {
		String confText = confTextBox.getText();
		return confText;
	}
	public void userlogout() {
		usernameBtn.click();
		logoutBtn.click();
	}

}
