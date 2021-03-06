package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountToTransfer {
	@FindBy(linkText= "Transfer Funds")
	private WebElement tranFund;
	
	public AccountToTransfer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFundTrans() {
		tranFund.click();
	}
	public boolean isTransferFund() {
		boolean tfpd = tranFund.isDisplayed();
		return tfpd;
		
	}

}
