package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.CommonUtilitis;
import Resources.Constants;
import Resources.baseclass;

public class VerifyLogin extends baseclass { //to access the browser
	
	@Test
	public void login() throws IOException {
	
		LoginPageObject obj = new LoginPageObject(driver);
		
		obj.enterUsername().sendKeys(Constants.username);
		
		//CommonUtilitis.handleExplicitWait(10, obj.enterPassword());
		//WebDriverWait wb1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wb1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		obj.enterPassword().sendKeys(Constants.password);
		
		
		//WebDriverWait wb2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wb2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		obj.clickOnLogin().click();
		
		//SoftAssert s = new SoftAssert();
		
		CommonUtilitis.handleassertion(Constants.Expected, obj.ActualString().getText());
		
		/*String Expected = Constants.Expected;
		String Actual = obj.ActualString().getText();
		s.assertEquals(Actual, Expected);
		s.assertAll();
	*/
		
	}
	

}
