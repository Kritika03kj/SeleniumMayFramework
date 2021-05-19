package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundVerify {
	@FindBy(id="btn_submit")
	private WebElement subm;
	
	public TransferFundVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicksubmitButton() {
		subm.click();
	}
}
