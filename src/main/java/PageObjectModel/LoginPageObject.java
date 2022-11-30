package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver; //this driver dont have scope
	
	private By username= By.xpath("//input[@id='username']");
	private By password= By.xpath("//input[@id='password']");
	private By logIn= By.xpath("//input[@id='Login']");
	private By Tryforfree= By.xpath("//a[@id='signup_link']");
	private By ActualString = By.xpath("driver.findElement(By.xpath(\"//div[@id='error']\")).getText();");



	public LoginPageObject(WebDriver driver2) {
	 this.driver=driver2;
	}

	public WebElement enterUsername() {
		
	return driver.findElement(username);
	
	}
	
	public WebElement enterPassword() {
		
		return driver.findElement(password);
		
		}
	public WebElement clickOnLogin() {
		
		return driver.findElement(logIn);
		
		}

	public WebElement clickOnTryforfree() {
		
		return driver.findElement(Tryforfree);
		}
	
	public WebElement ActualString() {
		return driver.findElement(ActualString);
	}



}