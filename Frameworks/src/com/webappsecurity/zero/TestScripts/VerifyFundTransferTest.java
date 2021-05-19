package com.webappsecurity.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountToTransfer;
import com.webappsecurity.zero.Pages.ConfirmationPage;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFundVerify;
import com.webappsecurity.zero.Pages.TransferFunds;

import uTils.GenericMethods;

public class VerifyFundTransferTest extends Base{
	@Test
	public void verifyFundTransfer() throws IOException {
		Login lp = new Login(driver);
		AccountToTransfer act = new AccountToTransfer(driver);
		ConfirmationPage cn = new ConfirmationPage(driver);
		TransferFunds tf = new TransferFunds(driver);
		TransferFundVerify tfv = new TransferFundVerify(driver);

		String[][] data = GenericMethods.getData("D:\\GSS\\4. selenium\\framework.xlsx","DATADRIVEN");

		for(int i = 1;i<data.length;i++) {
			lp.applicationLogin(data[i][0], data[i][1]);
			act.clickFundTrans();
			tf.transfFund(data[i][2], data[i][3]);
			tfv.clicksubmitButton();
			String actualText = cn.getConText();
			String expectedText = data[i][4];
			Assert.assertEquals(actualText, expectedText);
			cn.userlogout();

			driver.get("http://zero.webappsecurity.com/login.html");
		}

	}
}
