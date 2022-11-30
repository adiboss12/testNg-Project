package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.CommonUtilitis;
import Resources.Constants;
import Resources.baseclass;

public class VerifySignUp extends baseclass {
	
	
@Test
public void signup() throws IOException, InterruptedException {
	
	LoginPageObject lpo = new LoginPageObject(driver);
	
	lpo.clickOnTryforfree().click();
	
	SignupPageObject spo= new SignupPageObject(driver);
	
    Thread.sleep(2000);
	spo.USerfirstname().sendKeys(Constants.Firstname);
	spo.Userlastname().sendKeys(Constants.Lastname);
	spo.UserJobtitle().sendKeys(Constants.Jobtitle);
	spo.UserEmail().sendKeys(Constants.Email);
	spo.UserPhone().sendKeys(Constants.Phone);
	//spo.UserCompanyName().clear();
	
	//Thread.sleep(2000);
	//CommonUtilitis.handleExplicitWait(2, spo.SelectEmployee());
	/*WebElement p = spo.SelectEmployee();
	Select s = new Select(p);
	 s.selectByIndex(1);
	*/
	//Employee drop down
	CommonUtilitis.HandleStaticDropDown(spo.SelectEmployee(), 1);

	//country Drop down

	CommonUtilitis.HandleStaticDropDown(spo.SelectCountry(), 4);
	
	 //Thread.sleep(2000);
	/* WebElement country = spo.SelectCountry();
	 Select s1 = new Select(country);
	 s1.selectByValue("IT");
	*/
	
}


}
