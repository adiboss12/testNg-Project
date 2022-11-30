package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public SignupPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebDriver driver;
	
	
	By firstname= By.xpath("//input[@name='UserFirstName']");
	By lastname= By.xpath("//input[@name='UserLastName']");
	By Jobtitle= By.xpath("//input[@name='UserTitle']");
	By UserEmail= By.xpath("//input[@name='UserEmail']");
	By UserPhone= By.xpath("//input[@name='UserPhone']");
	By Employeedropdown= By.xpath("//select[@name='CompanyEmployees']");
	By Checkboxhadnling= By.xpath("//input[@type='checkbox']");
	By CompanyName = By.xpath("//input[@name='CompanyName']");
	By CountryName = By.xpath("//select[@name='CompanyCountry']");
	
	
	public WebElement USerfirstname() {
		return driver.findElement(firstname);
	}
	
	public WebElement Userlastname() {
		return driver.findElement(lastname);
	}
	
	public WebElement UserJobtitle() {
		return driver.findElement(Jobtitle);
	}
	public WebElement UserEmail() {
		return driver.findElement(UserEmail);
	}
	public WebElement UserPhone() {
		return driver.findElement(UserPhone);
	}

	public WebElement SelectEmployee() {
		return driver.findElement(Employeedropdown);
	}

	public WebElement UserCompanyName() {
		return driver.findElement(CompanyName);
	}
	
	public WebElement SelectCountry() {
		return driver.findElement(CountryName);
	}
}
