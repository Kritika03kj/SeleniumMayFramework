package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TransferFunds {
	@FindBy(id="tf_fromAccountId")
	private WebElement transferFunds;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id="tf_amount")
	private WebElement amy;
	
	@FindBy(id="tf_description")
	private WebElement desc;
	
	@FindBy(id="btn_submit")
	private WebElement cont;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  void transfFund(String amount, String description) {
		Select fromdd = new Select(transferFunds);
		fromdd.selectByIndex(2);
		
		Select todd = new Select(toAcc);
		todd.selectByIndex(3);
		
		amy.sendKeys(amount);
		desc.sendKeys(description);
		
		cont.click();
		
	}

}
